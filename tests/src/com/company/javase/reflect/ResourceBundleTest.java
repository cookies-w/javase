package com.company.javase.reflect;

import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {
        // 资源绑定器，只能绑定 xxx.properties 文件。并且这个文件必须在类路径下。文件扩展名也必须是 properties
        // 并且在写路径的时候，路径后面的扩展名不能写。
        //ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");

        ResourceBundle bundle =
                ResourceBundle.getBundle("com/company/javase/bean/db");

        String className = bundle.getString("className");
        System.out.println(className);
    }
}
