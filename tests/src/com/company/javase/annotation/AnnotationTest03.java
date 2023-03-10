package com.company.javase.annotation;

//表示这个类已过时
public class AnnotationTest03 {
    public static void main(String[] args) {
        AnnotationTest03 at = new AnnotationTest03();
        at.doSome();
    }

    @Deprecated
    public void doSome(){
        System.out.println("do something!");
    }
    //Deprecated这个注解标注的元素已过时
    //这个注解主要是向其他程序员传达一个信息，告知已过时，有更好的解决方案存在
    @Deprecated
    public static void doOther(){

    }
}

class T{
    public static void main(String[] args) {
        AnnotationTest03 at = new AnnotationTest03();
        at.doSome();
        AnnotationTest03.doOther();

        try {
            Class c = Class.forName("java.util.Date");
            Object obj = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
