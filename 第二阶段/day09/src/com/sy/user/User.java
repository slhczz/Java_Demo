package com.sy.user;

import com.sy.userImpl.UserImpl;
import com.sy.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User implements UserImpl {
    PreparedStatement pstmt =null;
    Connection conn = JdbcUtil.getConnection();
    @Override
    public boolean queryOne(String name,String password) {

        String sql = "select * from users where user = ? and password = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,password);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
               return true;
            }else{
                return false;
            }
        } catch (Exception e) {
           return false;
        }

    }

    @Override
    public boolean queryUser(String name) {
        String sql = "select * from users where user = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int addOne(String name,String password) {
        boolean qb = queryUser(name);
        if (qb){
            return 0;
        }else{
            String sql = "INSERT INTO `users` (`user`, `password`) VALUES (?, ?)";
            try {
                pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,name);
                pstmt.setString(2,password);
                int rs = pstmt.executeUpdate();
                if(rs>0){
                    return 1;
                }else{
                    return 0;
                }
            } catch (SQLException e) {
                return 0;
            }
        }
    }

    @Override
    public boolean updataPwd(String password) {
        return false;
    }

}
