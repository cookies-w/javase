package com.company.javase.reflect;

import java.util.Date;

public class ReflectTest01 {
    public static void main(String[] args) {
/*
        Class.forName()
        1、静态方法
        2、方法的参数是一个字符串。
        3、字符串需要的是一个完整类名。
        4、完整类名必须带有包名。java.lang 包也不能省略。
*/
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String"); // c1 代表 String.class 文件，或者说 c1 代表 String 类型。
            c2 = Class.forName("java.util.Date"); // c2 代表 Date 类型
            Class c3 = Class.forName("java.lang.Integer"); // c3 代表 Integer 类型
            Class c4 = Class.forName("java.lang.System"); // c4 代表 System 类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // java 中任何一个对象都有一个方法：getClass()
        String s = "abc";
        Class x = s.getClass(); // x 代表 String.class 字节码文件，x 代表 String 类型。
        System.out.println(c1 == x); // true（==判断的是对象的内存地址。）

        Date time = new Date();
        Class y = time.getClass();
        System.out.println(c2 == y); // true (c2 和 y 两个变量中保存的内存地址都是一样的，都指向方法区中的字节码文件。)

        // 第三种方式，java 语言中任何一种类型，包括基本数据类型，它都有.class 属性。
        Class z = String.class; // z 代表 String 类型
        Class k = Date.class; // k 代表 Date 类型
        Class f = int.class; // f 代表 int 类型
        Class e = double.class; // e 代表 double 类型

        System.out.println(x == z); // true
    }
}

