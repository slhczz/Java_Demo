package com.homework.homework2;

import java.io.*;

public class Homework2 {

    public static void main(String[] args) throws Exception {
        //拆分
        /*File f = new File("d:\\hw3");
        f.mkdir();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("d:\\Workspaces\\day17\\副本.MP3");
            byte[] bs = new byte[1024 * 1024];
            int len;
            int index = 1;
            while ((len = fis.read(bs)) != -1){
               FileOutputStream fo = new FileOutputStream("d:\\hw3\\"+"asdw"+index);
               fo.write(bs,0,len);
               index++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }*/
        //合并
        File file = new File("D:\\hw3");
        File hb = new File("D:\\hb");
        hb.mkdir();
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
           fos = new FileOutputStream("D:\\hb\\合并.mp3");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File[] files = file.listFiles();
        int len;
        byte[] hbb = new byte[1024 * 1024];
        for (int i = 0; i < files.length; i++) {
            fis = new FileInputStream(files[i]);
        while ((len = fis.read(hbb)) != -1){
            fos.write(hbb,0,len);
        }
        }
        fis.close();
        fos.close();
        System.out.println("合并成功");
    }

}
