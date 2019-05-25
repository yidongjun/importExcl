package com.example.Controller;

import com.example.importExcl.RuntimeTest;
import com.example.importExcl.ThreadSubList;
import com.example.services.Item;
import com.example.services.ItemDao;
import com.example.services.ItemExample;
import com.example.util.SpringContextUtil;
import org.redisson.api.RBucket;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

@RestController
public class ImportExclConstroller {
    private static  int threadCount =Runtime.getRuntime().availableProcessors() <<1 ;
//    private static  int threadCount =1;

    @Autowired
    RedissonClient redissonClient;
    @Autowired
    ItemDao itemDao;
    @RequestMapping("/test")
    public String test() throws IOException {
        ItemDao itemDao = SpringContextUtil.getBean(ItemDao.class);
        ItemExample itemExample = new ItemExample();
        itemExample.createCriteria().andIdEqualTo(Long.parseLong("134412720635120555"));

     return itemDao.selectByExample(itemExample).size()+"";

    }
    @RequestMapping("/import")
    public String importExcl() throws IOException, InterruptedException, ExecutionException {
        RLock rLock = this.redissonClient.getLock("importLock");
        rLock.lock();

        ThreadSubList.stopFlag =false;
        try{
        ExecutorService executors = Executors.newFixedThreadPool(threadCount);
        RBucket<Integer> importKey = redissonClient.getBucket("import");
        importKey.set(0);
        Long time = System.currentTimeMillis();
        List<String> list = readFile("C:\\slowsql\\item");
        int size = list.size();
        int remaining = size % threadCount; //余下的list。
        for (int i = 0; i < threadCount; i++) {
            executors.execute(new ThreadSubList(size / threadCount * i, size / threadCount * (i + 1), list));
        }

        executors.execute(new ThreadSubList(list.size() - remaining, list.size(), list));
        executors.shutdown();


        if (executors.awaitTermination(1, TimeUnit.DAYS)) {

            System.out.println("redisket=" + importKey.get());
            if (importKey.get() > 0) {
                System.out.println("运行耗时:"+ (System.currentTimeMillis()-time));
                return importKey.get() + 1 + " 行有问题";
            } else {
                System.out.println("运行耗时:"+ (System.currentTimeMillis()-time));
                return RuntimeTest.mysqlImport();
            }
        }
    }finally {
            rLock.unlock();
        }

        return "";

//        list.stream().forEach( l->{
//
//        });

    }
    public  static List<String>   readFile(String fileName) throws IOException {

        File f = new File(fileName);
        FileReader file = new FileReader(f);
        BufferedReader br = new BufferedReader(file);
        List<String> list = new ArrayList();
        while (br.ready()) {
            list.add(br.readLine().split("\\|")[0]);
        }
        br.close();
        file.close();
        return list;
    }

    public static void main(String[] args) throws IOException {
       int threadSize = 16;
        List list =new ArrayList();
        for(int i=0;i<4789;i++){
            list.add(i);
        }
        int size=list.size();
        int remaining = size%threadSize;
        for(int i=0;i<threadSize;i++){
           System.out.println( list.subList(size/threadSize *i, size/threadSize * (i+1)).size());
        }
      List asd =   list.subList(list.size()-remaining,list.size());
        System.out.println(asd.size());


    }


}
