package com.example.importExcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RuntimeTest {

    static String cmd = "C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysqlimport.exe  -h 127.0.0.1 -u root -p900523abc mysql_tester  --fields-terminated-by=\"|\" \"C:\\slowsql\\item\" --columns=\"id,shop_id,item_type,item_name\" --local";

    public static String  mysqlImport() throws IOException {
        Process p= Runtime.getRuntime().exec(cmd);
        p = Runtime.getRuntime().exec(cmd);
        InputStream fis=p.getInputStream();
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        String line=null;
        StringBuilder stringBuilder = new StringBuilder();
        while((line=br.readLine())!=null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }
}
