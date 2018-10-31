package com.homework.homework3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("输入姓名：");
        String name = sc.next();
        System.out.println("输入年龄：");
        int age = sc.nextInt();

        try {
            Student student = new Student(name,age);
        } catch (AgeException e) {
            System.out.println("年龄异常");
        }


    }

}
