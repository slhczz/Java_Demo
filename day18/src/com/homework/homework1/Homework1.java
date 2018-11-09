package com.homework.homework1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //输入学生信息存保存在集合中，并写入内存中
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("student.txt",true)));
        HashMap<String,Student> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("输入姓名");
            String name = sc.next();
            System.out.print("输入年龄");
            int age = sc.nextInt();
            map.put(name,new Student(name,age));
        }
        for (Map.Entry<String,Student> entry: map.entrySet()) {
            bw.write("name = "+ entry.getValue().getName() + ",age = " +entry.getValue().getAge());
            bw.newLine();
        }
        bw.close();

        System.out.println("========================================================");
        //在文件中读取学生信息并打印
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("student.txt")));

        String str;
        while ((str = br.readLine())!=null){

            System.out.println(str);

        }

        br.close();

    }

}
