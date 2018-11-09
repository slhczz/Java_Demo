package com.homework.homework4;

import java.io.*;

public class Homework4 {

    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Workspaces\\day17\\IO.mp4");
        FileInputStream fis = new FileInputStream("D:\\Workspaces\\day17\\IO.mp4");
        FileOutputStream fos = new FileOutputStream("d:\\hb\\IO_copy.mp4");
        long fileLength = file.length();
        byte[] bs = new byte[1024 * 1024];
        int len;
        double index = 0.0F;
        while ((len = fis.read(bs)) != -1){
            fos.write(bs);
            index+=0.161442140686622;
            System.out.println(index);
        }
    }

}
