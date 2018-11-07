package com.homework.homework4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homework4 {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("D:\\Workspaces\\day17\\IO.mp4");
        FileOutputStream fos = new FileOutputStream("d:\\hb\\IO_copy.mp4");
        FileInputStream foss = new FileInputStream("d:\\hb\\IO_copy.mp4");

      /*  try {
            fis =
            fos = new FileOutputStream("d:\\hb\\IO_copy.mp4");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        byte[] bs = new byte[1024 * 1024];
        long length = 0;
        int len,index = 0;
        while ((len = fis.read(bs)) != -1){
            length += len;
            index++;
        }
        while ((len = fis.read(bs)) != -1){
            fos.write(bs);
            while ((len = foss.read(bs)) != -1){
                System.out.println(index/index);
            }
        }


    }

}
