package com.company.javase.collection;

import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
        // 创建一个 Properties 对象
        Properties pro = new Properties();

        // 需要掌握 Properties 的两个方法，一个存，一个取。
        pro.setProperty("url", "jdbc:mysql://localhost:3306/bjpowernode");
        pro.setProperty("driver","com.mysql.jdbc.Driver");
        pro.setProperty("username", "root");
        pro.setProperty("password", "123");

        // 通过 key 获取 value
        String url = pro.getProperty("url");
        String driver = pro.getProperty("driver");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);
    }
}
