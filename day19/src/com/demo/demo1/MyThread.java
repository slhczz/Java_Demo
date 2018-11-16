package com.demo.demo1;

public class MyThread extends Thread {
private int num =10;
    @Override
    public void run() {
  String name = getName();
        while (num>0){
            System.out.println("Thread线程开启..............."+name);
            num--;
        }
    }
}
