package com.demo.demo3;

import java.util.Arrays;

public class Demo2 {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(homework2(arr));
    }

    public static String homework2(int[] arr) {
        String s ="[";
//    输出结果[1,2,3]
        for(int i =0;i<arr.length;i++) {
            if(i==arr.length-1) {
                s+=arr[i];
            }else {
                s+=arr[i];
                s+=", ";
            }
        }
        s+="]";
        return s;
    }


}
