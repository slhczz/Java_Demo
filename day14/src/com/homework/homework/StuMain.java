package com.homework.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class StuMain {

    public static void main(String[] args) {

        ArrayList<Student>  list = new ArrayList<>();

        Student stu1= new Student("张三",21);
        Student stu2= new Student("张三",21);
        Student stu6 = new Student("李四",18);
        Student stu3 = new Student("王五",25);
        Student stu4 = new Student("赵柳",22);
        Student stu5 = new Student("麻七",16);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        ArrayList<Student> newStu = new ArrayList<>();
        Iterator<Student> stuIt = list.iterator();
        //homework2(stuIt);
        while (stuIt.hasNext()){
            Student lst = (Student) stuIt.next();
            if(!newStu.contains(lst)){
                newStu.add(lst);
            }
        }
        for(int i = 0 ;i < newStu.size();i++){
            Student s = (Student)newStu.get(i);
            System.out.println(s.getName()+s.getAge());
        }

    }

    private static void homework2(Iterator<Student> stuIt) {
        int temp = 0;
        while (stuIt.hasNext()){
            Student lst = stuIt.next();
            if(lst.getAge() >= temp){
                temp = lst.getAge();
            }
        }
        System.out.println(temp);
    }

}
