package com.demo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("demo1.txt")));

        HashMap<Character,Integer> map = new HashMap<>();

        String str;
        while ((str = br.readLine()) != null){

            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }

            }

        }
        br.close();

        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("time.txt")));

        for (Map.Entry<Character,Integer> entry:map.entrySet()) {

            char ch = entry.getKey();
            int num = entry.getValue();

            bw.write(ch + "-" + num);
            bw.newLine();
        }
        bw.close();

    }


}
