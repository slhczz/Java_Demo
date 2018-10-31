package com.homework.homework3;

public class Student {

    String name;
    int age;

    public Student() {
        super();
    }
    public Student(String name,int age) throws AgeException {
        this.name = name;
        if(age > 150 || age<=0){
           throw  new AgeException();
        }else{
            this.age = age;
        }
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }
}
