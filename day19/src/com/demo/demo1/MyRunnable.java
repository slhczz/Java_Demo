package com.demo.demo1;

public class MyRunnable implements Runnable {

    private int num = 10;
    @Override
    public void run() {
        while (num>0){
            System.out.println("Runnable线程开启...............");
            num--;
        }

    }
}
