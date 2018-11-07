package com.homework.homework5;

import java.io.File;
import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("輸入文件夾路徑：");

        File file = new File(sc.next());
        homeWork(file);
    }
    public static String homeWork(File f){
        //判断路径是否存在
        boolean flg = f.exists();
        if(!flg){
            return null;
        }

        File[] files = f.listFiles();
        if(files!=null){
            for (File file : files) {
                System.out.println(file.getAbsolutePath());
                if(file.isDirectory()){
                    homeWork(file);
                }
            }
        }
        return null;
    }
}
