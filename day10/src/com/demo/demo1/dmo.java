package com.demo.demo1;

import java.util.Scanner;

public class dmo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int[] arr = new int[8];
        while(index<arr.length){
            System.out.println("输入第"+ (index+1) +"个学生年龄：");
            int a = sc.nextInt();
            arr[index] = a;
            index++;
        }
        homeWork3(arr,15);

    }

    public static int homeWork3(int[] arr,int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==val) {
                return i;
            }
        }
        return -1;
    }


}
