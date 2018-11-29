package com.sy.user.login;

import com.sy.user.User;
import com.sy.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到sy");
        System.out.println("请输入用户名");
        String iname = sc.nextLine();
        System.out.println("请输入密码");
        String ipassword = sc.nextLine();

        User u = new User();
        boolean rs = u.queryOne(iname,ipassword);
        if(rs){
            System.out.println("登陆成功");
        }else {
            System.out.println("登录失败");
        }

    }

}
