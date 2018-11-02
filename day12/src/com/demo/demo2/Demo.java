package com.demo.demo2;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);

        while (i<=3){
            System.out.print("输入用户名：");
            String name = sc.next();
            System.out.print("输入密码：");
            String pwd = sc.next();

            if("admin".equals(name)&&"admin".equals(pwd)){
                System.out.println("登陆成功");
                break;
            }else{
                System.out.println("登录失败");
                System.out.println("还有"+ (3-i) + "次机会");
                i++;
            }
        }
        sc.close();

    }

}
