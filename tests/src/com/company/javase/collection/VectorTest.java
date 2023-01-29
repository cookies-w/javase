package com.company.javase.collection;

import java.util.*;

public class VectorTest {
    public static void main(String[] args) {
        // 创建一个 Vector 集合
        List vector = new Vector();
        //Vector vector = new Vector();

        // 添加元素
        // 默认容量 10 个。
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);

        // 满了之后扩容（扩容之后的容量是 20.）
        vector.add(11);

        Iterator it = vector.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        // 这个可能以后要使用！！！！
        List myList = new ArrayList(); // 非线程安全的。
        // 变成线程安全的
        Collections.synchronizedList(myList);

        // myList 集合就是线程安全的了。
        myList.add("111");
        myList.add("222");
        myList.add("333");

    }
}
