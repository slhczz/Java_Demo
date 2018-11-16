package com.work1;

public class User {

    private String name;
    private String pwd;
    private int num;

    public User() {
        super();
    }

    public User(String name, String pwd,int num) {

        this.name = name;
        this.pwd = pwd;
        this.num = num;

    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public User setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public int getNum() {
        return num;
    }

    public User setNum(int num) {
        this.num = num;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", num=" + num +
                '}';
    }
}
