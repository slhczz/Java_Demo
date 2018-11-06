package com.homework;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Homework {

    public static void main(String[] args) {

       TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               int num = o1.getAge()-o2.getAge();
               return num;
           }
       });
        treeSet.add(new Student("李四",22));
        treeSet.add(new Student("王五",26));
        treeSet.add(new Student("赵柳",18));
        treeSet.add(new Student("麻七",24));
        for (Student stu:treeSet
             ) {
            System.out.println(stu.getName() + " " +stu.getAge());
        }

    }

}
