package com.company.javase.collection;

import java.util.*;

public class GenericTest02 {
    public static void main(String[] args) {
        // ArrayList<这里的类型会自动推断>()，前提是 JDK8 之后才允许。
        // 自动类型推断，钻石表达式！
        List<Animal> myList = new ArrayList<>();

        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());

        // 遍历
        Iterator<Animal> it = myList.iterator();
        while(it.hasNext()){
            Animal a = it.next();
            a.move();
        }

        List<String> strList = new ArrayList<>();

        // 类型不匹配。
        //strList.add(new Cat());
        strList.add("http://www.126.com");
        strList.add("http://www.baidu.com");
        strList.add("http://www.bjpowernode.com");

        // 类型不匹配。
        //strList.add(123);

        //System.out.println(strList.size());

        // 遍历
        Iterator<String> it2 = strList.iterator();
        while(it2.hasNext()){
            // 直接通过迭代器获取了 String 类型的数据
            String s = it2.next();
            // 直接调用 String 类的 substring 方法截取字符串。
            String newString = s.substring(7);
            System.out.println(newString);
        }
    }

}
