package com.demo.demo1;

import java.io.FileInputStream;
import java.io.FileReader;

public class Demo {

    public static void main(String[] args) throws Exception {

        FileInputStream fileReader = new FileInputStream("d:\\Workspaces\\day17\\demo.txt");

        int i;
        while ((i = fileReader.read()) != -1){
            System.out.println(i);
        }

        fileReader.close();



    }

}
