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
                if(file.isFile()){
                    System.out.println(file.getName());
                }else if(file.isDirectory()){

                    System.out.println(file.getName()+"\t");
                    File[] fi = file.listFiles();
                    for (File fii: fi) {
                        if(fii.isFile()){
                            System.out.println("\t" + fii.getName());
                        }else if(fii.isDirectory()){

                            File[] fir = fii.listFiles();
                            System.out.println("\t" + fii.getName()+"\t");
                            for (File firr:fir) {
                                if(file.isFile()){
                                    System.out.println("\t\t"+firr.getName());
                                }else if(firr.isDirectory()){
                                    System.out.println("\t\t"+firr.getName());
                                }else {
                                    System.out.println("\t\t"+firr.getName());
                                }
                            }
                        }else{
                            System.out.println("\t" + fii.getName());
                        }
                    }
                }else{
                    System.out.println(file.getName());
                }
            }
        }
        return null;
    }


}
