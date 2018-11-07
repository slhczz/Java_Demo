package com.demo.demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Workspaces\\day17\\demo2.txt",true);
        while (true) {
            System.out.println("输入字符(quit退出)");
            String str = sc.next();
            if("quit".equals(str)){
                break;
            }
            byte[] b = str.getBytes();
            fileOutputStream.write(b);

        }

        fileOutputStream.close();

    }

}
