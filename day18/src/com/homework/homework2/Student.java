package com.homework.homework2;

public class Student {

    private String name;
    private int age;
    private double score;

    public Student() {
        super();
    }

    public Student(String name, int age, double score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public double getScore() {
        return score;
    }

    public Student setScore(double score) {
        this.score = score;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
