package com.homework.homework2;

public class Main {

    public static void main(String[] args) {
            Main  m = new Main();
            Main.Demo dd = new Main.Demo();

            dd.method1();
            m.method1();
            dd.method2();
            m.method2();
            Main.Demo.method3();
    }
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public static class Demo{
        public void method1(){
            System.out.println("内部类method1");
        }
        public void method2(){
            System.out.println("内部类method2");
        }

        public static void method3(){
            System.out.println("内部类静态method3");
        }
    }
}
