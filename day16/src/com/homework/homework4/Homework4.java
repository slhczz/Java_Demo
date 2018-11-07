package com.homework.homework4;

import java.util.*;

public class Homework4 {

    public static void main(String[] args) {

        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] colors = {"黑桃","红桃","梅花","方片"};

        ArrayList<String> list = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>();

        for (String color:colors) {
            for (String num:nums) {
                String str = color+num;
                list.add(str);
            }
        }
        list.add("小王");
        list.add("大王");

        for (int i = 0; i < list.size(); i++) {
            map.put(i,list.get(i));
        }

//        for (String str: map.values()) {
//            System.out.println(str);
//        }

        TreeSet<String> person1 = new TreeSet<>();
        TreeSet<String> person2 = new TreeSet<>();
        TreeSet<String> person3 = new TreeSet<>();
        TreeSet<String> d = new TreeSet<>();
        Random random = new Random();
        int sj = random.nextInt(101);
        //洗牌
        for (int i = 0; i < sj; i++) {
            int index1 = random.nextInt(list.size());
            int index2 = random.nextInt(list.size());

            String temp = list.get(index1);
            list.set(index1,list.get(index2));
            list.set(index2,temp);

        }
        for (int i = 0; i < list.size(); i++) {
            //最后三张留作底牌  三人的牌
            if(i>=list.size()-3)
                d.add(list.get(i));
            else if(i%3==0)
                person1.add(list.get(i));
            else if(i%3==1)
                person2.add(list.get(i));
            else
                person3.add(list.get(i));
        }
        System.out.println(d);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);






    }

}
