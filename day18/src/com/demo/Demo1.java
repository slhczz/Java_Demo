package com.demo;

import java.io.*;

public class Demo1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("d:\\Workspaces\\day18\\demo1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\Workspaces\\day18\\demo2.txt"));

        String str;
        int num = 0;
        while ((str = br.readLine()) != null){

            bw.write(str);
            bw.newLine();
            num++;
        }

        System.out.println(num);
        br.close();
        bw.close();

    }


}
