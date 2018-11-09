package com.homework.homework3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("user.txt")));

        System.out.println("\t\t**系统启动**");
        System.out.println("\t\t\t登录");
        System.out.println("\t\t\t注册");
        System.out.println("\t\t1：登录，2：注册");
        switch (sc.nextInt()){
            case 1:
                System.out.println("登录");
                break;
            case 2:
                System.out.println("注册");
                break;
            default:
                System.out.println("退出系统");
        }






    }

}
