package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Collection<Student> collection = new ArrayList<>();

        Student student1 = new Student("lixi","nv");
        Student student2 = new Student("wansan","nan");


        collection.add(student1);
        collection.add(student2);
        Iterator<Student> st = collection.iterator();
        while (st.hasNext()){

            Student stu = st.next();
            System.out.println(stu.getName() + " " + stu.getSex());

        }


    }

}
