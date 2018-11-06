package com.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo1 {

    public static void main(String[] args) {

        Map<String,Student> stuMap = new HashMap<>();

        stuMap.put("小明",new Student("小明",28));
        stuMap.put("小刚",new Student("小刚",16));
        stuMap.put("小黑",new Student("小黑",25));

        Set<String> keySet = stuMap.keySet();
        for (String value: keySet
             ) {
            System.out.println("key = " + value);
        }
        Set<Map.Entry<String,Student>> map = new HashSet<>();



    }

}
