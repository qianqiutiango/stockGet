package cn.swufe.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TestGet {
    public static void main(String[] args) {
        URL ur = null;
        try {

            ur = new URL("http://hq.sinajs.cn/list=sh601003,sh601001");
            HttpURLConnection uc = (HttpURLConnection) ur.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(ur.openStream(),"GBK"));
            String line;
            List<String> stockList = new ArrayList<>();
            while((line = reader.readLine()) != null){
                System.out.println(line);
                stockList.add(line);
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
