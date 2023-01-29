package com.company.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        // 联合起来写
        System.out.println("hello world!");

        // 分开写
        PrintStream ps = System.out;
        ps.println("hello zhangsan");
        ps.println("hello lisi");
        ps.println("hello wangwu");

        // 标准输出流不需要手动 close()关闭。
        // 可以改变标准输出流的输出方向吗？ 可以

        /*// 这些是之前 System 类使用过的方法和属性。
        System.gc();
        System.currentTimeMillis();
        PrintStream ps2 = System.out;
        System.exit(0);
        System.arraycopy(....);*/

        // 标准输出流不再指向控制台，指向“log”文件。
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        // 修改输出方向，将输出方向修改到"log"文件。
        System.setOut(printStream);
        // 再输出
        System.out.println("hello world");
        System.out.println("hello kitty");
        System.out.println("hello zhangsan");

    }
}
