package com.company.javase.reflect;


import com.company.javase.bean.User;

public class ReflectTest02 {
    public static void main(String[] args) {
        // 这是不使用反射机制，创建对象
        User user = new User();
        System.out.println(user);

        // 下面这段代码是以反射机制的方式创建对象。
        try {
            // 通过反射机制，获取 Class，通过 Class 来实例化对象
            Class c = Class.forName("com.company.javase.bean.User"); // c 代表User 类型。

            // newInstance() 这个方法会调用 User 这个类的无参数构造方法，完成对象的创建。
            // 重点是：newInstance()调用的是无参构造，必须保证无参构造是存在的！
            Object obj = c.newInstance();

            System.out.println(obj); // com.bjpowernode.java.bean.User@10f87f48
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}