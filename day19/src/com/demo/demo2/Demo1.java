package com.demo.demo2;

public class Demo1 {

    public static void main(String[] args) {

        Thread t1 = new Thread("lisi"){
            @Override
            public void run() {
                System.out.println("你好"+getName());
            }
        };
        t1.setName("wangwu");
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println(this.getName());
            }
        };
    }

}
