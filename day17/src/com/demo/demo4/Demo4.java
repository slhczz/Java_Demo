package com.demo.demo4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("d:\\Workspaces\\day17\\副本.mp3");
        FileOutputStream fos = new FileOutputStream("d:\\Workspaces\\day17\\副本-1.MP3");

        byte[] b = new byte[1024];
        int len;
        while ((len=fis.read(b))!=-1){
            for (int i = 0; i < len; i++) {
                b[i] = (byte) ((byte) b[i] ^ 127);
            }
            fos.write(b);
        }
        fis.close();
        fos.close();

    }

}
