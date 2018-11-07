package com.homework.homework2;

import java.util.*;

public class Homeowrk2 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


        list1.add("a");
        list1.add("b");
        list1.add("c");

        list2.add("c");
        list2.add("d");
        list2.add("e");

       list1.addAll(list2);
       System.out.println("并集 "+list1);

        list1.retainAll(list2);
        System.out.println("交集 "+list1);

        list1.removeAll(list2);
        System.out.println("差集 "+list1);
    }

}
