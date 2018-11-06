package com.homework;

import java.util.*;

public class homework2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("收入字符串：");
        String str = sc.next();

        char[] arr = str.toCharArray();
        TreeSet<Character> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        Iterator<Character> it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
        sc.close();


    }

}
