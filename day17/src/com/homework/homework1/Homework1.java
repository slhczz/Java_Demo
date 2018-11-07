package com.homework.homework1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\Workspaces\\day17\\config.txt",true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("输入用户名：");
        String name = sc.next();
        try {
            fos.write(name.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("输入密码：");
        String pwd = sc.next();
        try {
            fos.write("=".getBytes());
            fos.write(pwd.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
