package com.demo.demo1;

public class Demo {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread2 = new MyThread();
        myThread2.start();

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.start();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();

    }

}
