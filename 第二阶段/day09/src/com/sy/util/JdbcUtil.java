package com.sy.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {
    private static Properties p = new Properties();
    private static String mysqlclass;
    private static String url;
    private static String user;
    private static String password;

    static {
        try {
            p.load(new FileInputStream("config.properties"));
            mysqlclass = p.getProperty("mysqlclass");
            url = p.getProperty("url");
            user = p.getProperty("user");
            password = p.getProperty("password");
            Class.forName(mysqlclass);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(PreparedStatement pstmt,Connection conn){

        try {
            if(pstmt != null){
                pstmt.close();
            }else if(conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(ResultSet rs,PreparedStatement pstmt,Connection conn){

        try {
            if(rs != null){
                rs.close();
            }else if(pstmt != null){
                pstmt.close();
            }else if(conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
