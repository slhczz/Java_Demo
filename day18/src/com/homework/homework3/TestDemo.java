package com.homework.homework3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("user.txt",true)));
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("user.txt")));
        HashMap<String,User> map =  new HashMap<>();
        registerHashMap(br, map);

        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t**系统启动**");
        System.out.println("\t\t\t登录");
        System.out.println("\t\t\t注册");
        System.out.println("\t\t1：登录，2：注册");
        int num = sc.nextInt();
        switch (num){
           case 1:
               login(bw,br,sc, map);
               break;
           case 2:
               register(sc, bw, map);
               break;
           default:
               System.out.println("退出系统");
               break;
       }

    br.close();
    bw.close();

    }

//    用户登录
    private static void login(BufferedWriter bw,BufferedReader br,Scanner sc, HashMap<String, User> map) throws IOException {
        System.out.println("输入用户名：");
        String name = sc.next();
        if(map.containsKey(name)){
            while (true) {
                System.out.println("输入密码");
                String password = sc.next();
                if (password.equals(map.get(name).getPassword())) {
                    System.out.println("登陆成功");
                    break;
                } else {
                    System.out.println("密码错误");
                    System.out.println("重新密码错误");
                    continue;
                }
            }
        }else{
            System.out.println("无此用户是否注册？");
            if(sc.nextInt() == 2){
                registerHashMap(br, map);
                register(sc, bw, map);
            }else{
                System.out.println("退出系统");
            }
        }

    }
    //遍历文件内容
    private static void registerHashMap(BufferedReader br, HashMap<String, User> map) throws IOException {
        String str ;
        while ((str = br.readLine()) != null){
            String[] strings = str.split(",");
            map.put(strings[0],new User(strings[0],strings[1]));
        }
    }

    //用户注册，保存在集合中
    private static void register(Scanner sc, BufferedWriter bw, HashMap<String, User> map) throws IOException {
        String password = "";
        String copypassword = "";

        System.out.print("输入用户名");
        String name = sc.next();
        if(!map.containsKey(name.toLowerCase())){
            System.out.print("输入密码");
            password = sc.next();
            System.out.print("重复密码");
            copypassword = sc.next();
            while (true) {
                if (password.equals(copypassword)) {
                    bw.write(name + "," + password);
                    bw.newLine();
                    break;
                } else {
                    System.out.println("二次密码不一致");
                    System.out.print("输入密码");
                    password = sc.next();
                    System.out.print("重复密码");
                    copypassword = sc.next();
                    continue;
                }
            }
        }else {
            System.out.println("用户名重复");
        }
    }

}
