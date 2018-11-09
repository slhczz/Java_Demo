package com.homework.homework2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Homework2 {

    public static void main(String[] args)  throws Exception{
    //获取学生信息
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("student1.txt")));

        ArrayList<Student> list = new ArrayList<>();
//        遍历学生信息并添加进数组
        String str;
        while ((str = br.readLine()) != null){
            String[] st = str.split(",");
            list.add(new Student(st[0],Integer.parseInt(st[1]),Integer.parseInt(st[2])));
        }
        br.close();
        for (Student stu:list) {
            System.out.println(stu);
        }



    }

}
