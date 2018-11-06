package com.demo;

import java.io.File;
import java.io.IOException;

public class Demo4 {

    public static void main(String[] args) throws Exception {

        File file = new File("d:\\personalfilms");
        boolean flg = file.mkdir();
        System.out.println("flg  " + flg);
        File newf = new File("d:\\personalmovies");
        boolean flg2 = file.renameTo(newf);
        System.out.println("flg2 " + flg2);
        File newFile = new File(newf,"TokyoHot.txt");
        boolean flg3 = newFile.createNewFile();
        System.out.println("flg3 " + flg3);

    }

}
