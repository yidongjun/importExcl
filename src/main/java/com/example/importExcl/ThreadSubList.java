package com.example.importExcl;
import com.example.services.Item;
import com.example.services.ItemDao;
import com.example.services.ItemExample;
import com.example.util.SpringContextUtil;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.Callable;

public class ThreadSubList implements Runnable {
    private volatile int start;
    private volatile int end;
    private List<String> dataList;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public List<String> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = dataList;
    }

    public ThreadSubList(int start, int end, List<String> dataList) {
        this.start = start;
        this.end = end;
        this.dataList = dataList;
    }
   private  Logger logger= LoggerFactory.getLogger(this.getClass());
    public void run()   {

        ItemDao itemDao = SpringContextUtil.getBean(ItemDao.class);

        RedissonClient redissonClient = SpringContextUtil.getBean(RedissonClient.class);

        RBucket<Integer > rBucket = redissonClient.getBucket("import");
            for (int i = start; i < end; i++) {
                ItemExample itemExample = new ItemExample();
                itemExample.createCriteria().andIdEqualTo(Long.parseLong(dataList.get(i)));

                List<Item> list = itemDao.selectByExample(itemExample);
                logger.info("size==="+list.size() +"id="+dataList.get(i));
                if (list.size() > 0) {
                    logger.info("set key=" + list.get(0).getId() + "i==" + i);
                    rBucket.set(i);
                }
            }
    }

}
