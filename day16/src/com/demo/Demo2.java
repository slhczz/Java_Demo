package com.demo;

import java.util.HashMap;

public class Demo2 {

    public static void main(String[] args) {

        String str = "qwerqwertyuiytrezxcvbn";

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                Integer num = map.get(ch);
                num++;
                map.put(ch,num);
            } else {
                map.put(ch,1);
            }
        }
        System.out.println(map);

    }

}
