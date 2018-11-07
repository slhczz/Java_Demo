package com.demo.demo5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("d:\\Workspaces\\day17\\副本.MP3");
            fos = new FileOutputStream("d:\\Workspaces\\day17\\副本_1.MP3");

            byte[] bs = new byte[1024];
            int len;
            while ((len = fis.read(bs)) != -1){

                fos.write(bs);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fis.close();
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

}
