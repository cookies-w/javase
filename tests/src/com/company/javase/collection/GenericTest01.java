package com.company.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        // 使用 JDK5 之后的泛型机制
        // 使用泛型 List<Animal>之后，表示 List 集合中只允许存储 Animal 类型的数据。
        // 用泛型来指定集合中存储的数据类型。
        List<Animal> myList = new ArrayList<Animal>();

        // 指定 List 集合中只能存储 Animal，那么存储 String 就编译报错了。
        // 这样用了泛型之后，集合中元素的数据类型更加统一了。
        //myList.add("abc");
        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b);

        // 获取迭代器
        // 这个表示迭代器迭代的是 Animal 类型。
        Iterator<Animal> it = myList.iterator();
        while(it.hasNext()){
            // 使用泛型之后，每一次迭代返回的数据都是 Animal 类型。
            //Animal a = it.next();
            // 这里不需要进行强制类型转换了。直接调用。
            //a.move();
            // 调用子类型特有的方法还是需要向下转换的！
            Animal a = it.next();
            if(a instanceof Cat) {
                Cat x = (Cat)a;
                x.catchMouse();
            }
            if(a instanceof Bird) {
                Bird y = (Bird)a;
                y.fly();
            }
        }
    }
}

class Animal {
    // 父类自带方法
    public void move(){
        System.out.println("动物在移动！");
    }
}

class Cat extends Animal {
    // 特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}

class Bird extends Animal {
    // 特有方法
    public void fly(){
        System.out.println("鸟儿在飞翔！");
    }
}


