package com.demo;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeSet<Sut>  suts = new TreeSet<>(new Comparator<Sut>() {
            @Override
            public int compare(Sut o1, Sut o2) {
               return (o1.getSx()+o1.getYw()+o1.getYy())-(o2.getSx()+o2.getYw()+o2.getYy());
            }
        });
        for (int i = 0; i < 5; i++) {
            System.out.println("输入第一个学生姓名：");
            String name = sc.next();
            System.out.println("输入第一个学生语文：");
            int yw = sc.nextInt();
            System.out.println("输入第一个学生数学：");
            int sx = sc.nextInt();
            System.out.println("输入第一个学生英语：");
            int yy = sc.nextInt();
            suts.add(new Sut(name,yw,sx,yy));
        }
        System.out.println(suts);
        for (Sut sut: suts) {
            System.out.println(sut.getName() + " " + sut.getYw() + " " + sut.getSx() + " " + sut.getYy());
        }
    }

}
