package com.demo;

import java.util.ArrayList;
import java.util.Random;

public class Demo3 {

    public static void main(String[] args) {
        String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] colors = {"黑桃","紅桃","梅花","方片"};

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < colors.length; j++) {

                list.add(nums[i].concat(colors[j]));

            }

        }

        list.add("小王");
        list.add("大王");
        ArrayList<String> person1 = new ArrayList<>();
        ArrayList<String> person2 = new ArrayList<>();
        ArrayList<String> person3 = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();
        Random random = new Random();

        int num  = random.nextInt(54);
        for (int i = 0; i < num; i++) {
            //确定交换的两张牌的位置
            int index1 = random.nextInt(list.size());
            int index2 = random.nextInt(list.size());

            //交换
            String temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
        }

        for (int i = 0; i < list.size(); i++) {
            if(i>=list.size()-3){
                d.add(list.get(i));
            }else if(i % 3 == 0){
                person1.add(list.get(i));
            }else if(i % 3 == 1){
                person2.add(list.get(i));
            }else {
                person3.add(list.get(i));
            }
        }

        System.out.println("person1：" + person1);
        System.out.println("person1：" + person2);
        System.out.println("person1："+ person3);
        System.out.println("d：" + d);
    }

}
