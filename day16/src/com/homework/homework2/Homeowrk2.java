package com.homework.homework2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Homeowrk2 {

    public static void main(String[] args) {

        Set<String> list1 = new HashSet<>();
        Set<String> list2 = new HashSet<>();


        list1.add("a");
        list1.add("b");
        list1.add("c");

        list2.add("c");
        list2.add("d");
        list2.add("e");

      /*  list1.addAll(list2);
        System.out.println("并集 "+list1);*/

        list1.retainAll(list2);
        System.out.println("交集 "+list1);

      /*  list1.removeAll(list2);
        System.out.println("差集 "+list1);*/
    }

}
