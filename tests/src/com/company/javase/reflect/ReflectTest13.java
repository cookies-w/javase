package com.company.javase.reflect;

public class ReflectTest13 {
    public static void main(String[] args) throws Exception{
        // String 举例
        Class stringClass = Class.forName("java.lang.String");

        // 获取 String 的父类
        Class superClass = stringClass.getSuperclass();
        System.out.println(superClass.getName());

        // 获取 String 类实现的所有接口（一个类可以实现多个接口。）
        Class[] interfaces = stringClass.getInterfaces();
        for(Class in : interfaces){
            System.out.println(in.getName());
        }

    }
}
