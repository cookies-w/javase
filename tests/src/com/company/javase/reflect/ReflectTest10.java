package com.company.javase.reflect;

import com.company.javase.service.UserService;

import java.lang.reflect.Method;

public class ReflectTest10 {
    public static void main(String[] args) throws Exception{
        // 不使用反射机制，怎么调用方法
        // 创建对象
        UserService userService = new UserService();
        // 调用方法
        /*
        要素分析：
        要素 1：对象 userService
        要素 2：login 方法名
        要素 3：实参列表
        要素 4：返回值
        */
        boolean loginSuccess = userService.login("admin","123");
        //System.out.println(loginSuccess);
        System.out.println(loginSuccess ? "登录成功" : "登录失败");

        // 使用反射机制来调用一个对象的方法该怎么做？
        Class userServiceClass =
                Class.forName("com.company.javase.service.UserService");
        // 创建对象
        Object obj = userServiceClass.newInstance();
        // 获取 Method
        Method loginMethod = userServiceClass.getDeclaredMethod("login",
                String.class, String.class);
        //Method loginMethod = userServiceClass.getDeclaredMethod("login",int.class);
        // 调用方法
        // 调用方法有几个要素？ 也需要 4 要素。
        // 反射机制中最最最最最重要的一个方法，必须记住。
        /*
        四要素：
        loginMethod 方法
        obj 对象
        "admin","123" 实参
        retValue 返回值
        */
        Object retValue = loginMethod.invoke(obj, "admin","123123");
        System.out.println(retValue);
    }
}
