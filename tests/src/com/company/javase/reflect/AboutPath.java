package com.company.javase.reflect;

public class AboutPath {
    public static void main(String[] args) throws Exception{
        /*解释：
        Thread.currentThread() 当前线程对象
        getContextClassLoader() 是线程对象的方法，可以获取到当前线程的类加载器
        对象。
        getResource() 【获取资源】这是类加载器对象的方法，当前线程的类加载器默
        认从类的根路径下加载资源。*/
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath(); // 这种方式获取文件绝对路径是通用的。

        // 采用以上的代码可以拿到一个文件的绝对路径。
        ///C:/Users/Administrator/IdeaProjects/javase/out/production/chapter25/classinfo2.properties
        System.out.println(path);

        // 获取 db.properties 文件的绝对路径（从类的根路径下作为起点开始）
        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("com/company/javase/bean/db.properties").getPath();
        System.out.println(path2);
    }
}
