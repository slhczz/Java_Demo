package com.sy.user.register;

import com.sy.user.User;
import java.util.Scanner;

public class Resister {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到sy");
        System.out.println("欢迎注册");
        System.out.println("输入用户名");
        String iname = sc.nextLine();/*
        System.out.println("输入密码");
        String ipassword = sc.nextLine();*/
        User u = new User();
        for (int i = 1;i<10;i++){
            int rs = u.addOne(iname+i,"123456");
            if(rs>0){
                System.out.println("注册成功");
            }else {
                System.out.println("注册失败");
            }

        }

    }

}
