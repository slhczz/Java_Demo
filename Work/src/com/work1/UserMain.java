package com.work1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("users.txt"));
        HashMap<String,User> users = new HashMap<>();
        String str;
        int num = 0;
        while ((str = br.readLine())!=null){
            String[] strings = str.split("=");
            users.put(strings[0],new User(strings[0],strings[1],Integer.parseInt(strings[2])));
        }
        //System.out.println(users);
        while (true) {
            System.out.print("请输入用户名：");
            String name = sc.next();
            System.out.print("请输入密码：");
            String pwd = sc.next();

            if(users.containsKey(name)){
                num = users.get(name).getNum();
                if(num < 3){
                    if(pwd.equals(users.get(name).getPwd())){
                        System.out.println("登陆成功");
                    }else {
                        users.get(name).setNum(num+1);
                        System.out.println("用户名或密码错误" + (num + 1));
                    }
                }else{
                    System.out.println(name + "登录失败过多接口关闭，明天再试");
                    break;
                }

            }else{
                System.out.println("用户名不存在，请联系管理员");
            }


        }
    }

}
