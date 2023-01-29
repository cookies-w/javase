package com.company.javase.annotation;

public class MyAnnotationTest {
    // 报错的原因：如果一个注解当中有属性，那么必须给属性赋值。（除非该属性使用default 指定了默认值。）
    /*@MyAnnotation
    public void doSome(){
    }*/

    //@MyAnnotation(属性名=属性值,属性名=属性值,属性名=属性值)
    //指定 name 属性的值就好了。
    /*@MyAnnotation(name = "zhangsan", color = "红色")
    public void doSome(){

    }*/

    // 报错原因：没有指定属性的值。
    /*@MyAnnotation
    public void doSome(){

    }*/

    @MyAnnotation(value = "hehe")
    public void doSome(){

    }

    @MyAnnotation("haha")
    public void doOther(){

    }


}
