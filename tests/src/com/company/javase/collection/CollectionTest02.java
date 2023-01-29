package com.company.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest02 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();
        // 向集合中存储元素
        String s1 = new String("abc");
        c.add(s1);
        String s2 = new String("def");
        c.add(s2);
        System.out.println("元素的个数是：" + c.size());

        String x = new String("abc");
        // c 集合中是否包含 x？
        System.out.println(c.contains(x));

    }
}
