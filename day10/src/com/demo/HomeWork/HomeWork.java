package com.demo.HomeWork;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        HomeWork1(sc);

//        System.out.println("输入第一个学生年龄：");
//        int val1 = sc.nextInt();
//        System.out.println("输入第二个学生年龄：");
//        int val2 = sc.nextInt();
//        System.out.println("输入第三个学生年龄：");
//        int val3 = sc.nextInt();
//        System.out.println("输入第四个学生年龄：");
//        int val4 = sc.nextInt();
//        System.out.println("输入第五个学生年龄：");
//        int val5 = sc.nextInt();
//
//        HomeWork2(val1,val2,val3,val4,val5);

        int index = 0;
        int[] arr = new int[10];
        while(index<arr.length){
            System.out.println("输入第"+ (index+1) +"个学生年龄：");
           int a = sc.nextInt();
           arr[index] = a;
            index++;
        }
        HomeWork5(arr);

//        int[] arr = {11,13,10,15,9,23,88,90,3,10};
//        HomeWork5(arr);
//        binSearch(arr,15);

     //   indexOf(arr,15);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }

    public static int indexOf(int[] arr,int value){
        //数组中的元素前后交换, 遍历的次数只能是数组长度的一半
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value) {
                return i;
            }
        }
        return -1;
    }
    public static void binSearch(int[] arr, int value){
        //定义有效元素开始的角标
        int start = 0;
        //定义有效元素结束的角标
        int end = arr.length-1;
        //定义中间的比较值
        int mid ;
        //当有效范围的开始角标已经大于结束角标了,说明已经没有有效元素了
        while(start>end){
            //计算中间的角标
            mid = (end+start)/2;
            if(arr[mid]==value){
                System.out.println(mid);
            }else if(arr[mid]>value){
                //如果中间角标位上的值大于要查找的值,
                //说明中间值后面的数都不可能匹配上了
                end = mid - 1;
            }else if(arr[mid]<value){
                //如果中间角标位上的值小于要查找的值,
                //说明中间值前面的数都不可能匹配上了
                start = mid + 1;
            }
        }
        //没有找到的话返回-1
        System.out.println("-1");
    }

       public static void HomeWork2(int... arr){
        //外循环控制整体的循环次数,每次都可以确定一个最大或最小元素
        for (int i = 1; i < arr.length; i++) {
            //内循环控制有效范围内相邻元素的比较
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = arr.length-5; i < arr.length-1; i++) {
            System.out.print(arr[i] + "\t");
        }
    }


    public static void HomeWork1(Scanner sc) {
        System.out.println("输入任意整数：");
        int val = sc.nextInt();
        int sum = 1;
        if(val<=0) {
            System.out.println("输入错误");
        }else {
            for (int i = 1; i <= val; i++) {
                // System.out.println(i);
                sum *= i;
            }
            System.out.println(sum);
        }
    }

    public static void HomeWork5(int... arr){
        //外循环控制整体的循环次数,每次都可以确定一个最大或最小元素
        for (int i = 1; i < arr.length; i++) {
            //内循环控制有效范围内相邻元素的比较
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int num = 0;
        for (int i = arr.length-9; i < arr.length-1; i++) {
            num+=arr[i];
        }
        System.out.println(num/8);
    }


}
