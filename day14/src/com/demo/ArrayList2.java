package com.demo;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
StringBuffer sb = new StringBuffer();
StringBuilder sd = new StringBuilder("qwertw");
        System.out.println(sd.reverse());;
        list.add("小明");
        list.add("小黑");
        list.add("小蓝");
        list.add("小蓝");
        list.add("小蓝");
        list.add("小蓝");
        list.add("小红");
        list.add("小紫");
        for (int i = 0; i < list.size()-1; i++) {

            if(list.get(i).equals(list.get(i+1))){
                list.remove(i+1);
                i--;
            }
        }
        System.out.println(list);

String str = "qwerqqweqwea",str2="";

for(int i=0;i<str.length();i++){
    if (!str2.contains(str.substring(i,i+1))) {
        str2+=str.substring(i,i+1);
    }
    System.out.println(str2);


}
        System.out.println(str2);


        Random rm = new Random();
     //  System.out.println(rm.nextInt(61));
        int a = rm.nextInt(31)+30;
        System.out.println(a);



    }

}
