package com.company.javase.reflect;

public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10, 20);

        // 编译报错
        //m("abc");

        m2(100);
        m2(200, "abc");
        m2(200, "abc", "def");
        m2(200, "abc", "def", "xyz");

        m3("ab", "de", "kk", "ff");

        String[] strs = {"a","b","c"};
        // 也可以传 1 个数组
        m3(strs);

        // 直接传 1 个数组
        m3(new String[]{"我","是","中","国", "人"}); //没必要

        m3("我","是","中","国", "人");
    }

    public static void m(int... args){
        System.out.println("m 方法执行了！");
    }

    //报错
    //public static void m2(int... args2, String... args1){}

    // 必须在最后，只能有 1 个。
    public static void m2(int a, String... args1){
        System.out.print(a + " : ");
        for(int i = 0; i < args1.length; i++){
            System.out.print(args1[i] + " ");
        }
        System.out.println();
    }

    public static void m3(String... args){
        //args 有 length 属性，说明 args 是一个数组！
        // 可以将可变长度参数当做一个数组来看。
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}