package com.demo.demo2;

import java.io.FileInputStream;

public class Demo2 {

    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("d:\\Workspaces\\day17\\demo.txt");

        byte[] bs = new byte[1024];
        int len;

        while ((len = fileInputStream.read())!=-1){
            System.out.println(len);
        }

        fileInputStream.close();

    }

}
