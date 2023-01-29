package com.company.javase.reflect;

public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            // Class.forName()这个方法的执行会导致：类加载。
            Class.forName("com.company.javase.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass{
    //静态代码块在类加载时执行，并且只执行一次
    static {
        System.out.println("MyClass类的静态代码块执行了！");
    }
}
