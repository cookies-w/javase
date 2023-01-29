package com.company.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            m1();
            System.out.println("hello world!");
        } catch (FileNotFoundException e){
            System.out.println("文件不存在，可能路径错误，也可能该文件被删除了！");
            System.out.println(e);
        }
        // try..catch 把异常抓住之后，这里的代码会继续执行。
        System.out.println("main over");
    }
    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        // 以上代码出异常，这里是无法执行的。
        System.out.println("m1 over");
    }
    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        // 以上如果出现异常，这里是无法执行的！
        System.out.println("m2 over");
    }
    private static void m3() throws FileNotFoundException {
        new FileInputStream("E:\\IdeaText\\快捷键.txt");
        System.out.println("如果以上代码出异常，这里会执行吗??????????????????不 会！！！");
    }
}
