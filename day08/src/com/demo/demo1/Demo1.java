package com.demo.demo1;

public class Demo1 {

    //创建唯一的永远存在的静态变量
    private static Demo1 demo1 = new Demo1();
    //私有化构造方法
    private Demo1(){

    }
    //提供外部访问接口
    public static Demo1 getInstance(){
        return demo1;
    }

    public void clear(){
        System.out.println("打扫卫生");
    }

}
