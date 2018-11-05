package com.demo;

import java.util.ArrayList;
import java.util.HashSet;

public class StudentMain {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("李四",22));
        list.add(new Student("王五",32));
        list.add(new Student("李四",22));

        HashSet<Student> hashS = new HashSet<>(list);

        for (int i = 0; i < hashS.size(); i++) {
            Student stu = list.get(i);
        }

        System.out.println(list.get(2).getName());

    }

}
