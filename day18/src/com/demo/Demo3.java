package com.demo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class Demo3 {

    public static void main(String[] args) throws IOException {
//        读取文件中的数据
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("config.txt")));

        HashMap<String,Integer> map = new HashMap<>();
        int nm =0;
        String str;
        while ((str = br.readLine()) != null){
            String name = str.substring(0,str.lastIndexOf("="));
            String num = str.substring(str.length()-1);
            nm =parseInt(num)  ;
            map.put(name,nm);
        }
        br.close();

//        写数据到文件中
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("config.txt")));
        for (Map.Entry<String,Integer> entry:map.entrySet()) {

            String name = entry.getKey();
            int num = entry.getValue();
            if(num==0){
                System.out.println("使用结束请注册正版");
                bw.write(name+"="+0);
            }else{
                System.out.println("还有"+num+"次试用机会");
                bw.write(name+"="+(num-1));
            }

        }


bw.close();

    }

}
