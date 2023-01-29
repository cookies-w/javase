package com.company.javase.annotation;

/**
 * 自定义注解
 */
public @interface MyAnnotation {
    /**
     * 我们通常在注解当中可以定义属性，以下这个是 MyAnnotation 的 name 属性。
     * 看着像 1 个方法，但实际上我们称之为属性 name。
     * @return
     */
//    String name();

    /*
    颜色属性
    */
//    String color();

    /*
    年龄属性
    */
//    int age() default 25; //属性指定默认值

    /*
    指定一个 value 属性。
    */
    String value();

    //String email();
}
