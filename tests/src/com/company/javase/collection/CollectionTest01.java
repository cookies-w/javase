package com.company.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest01 {
    public static void main(String[] args) {
        // ArrayList 集合：有序可重复
        Collection c1 = new ArrayList();
        // 添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);

        // 迭代集合
        Iterator it = c1.iterator();
        while(it.hasNext()){
            // 存进去是什么类型，取出来还是什么类型。
            Object obj = it.next();
            System.out.println(obj);
        }

        // HashSet 集合：无序不可重复
        Collection c2 = new HashSet();
        // 无序：存进去和取出的顺序不一定相同。
        // 不可重复：存储 100，不能再存储 100.
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(90);
        c2.add(400);
        c2.add(50);
        c2.add(60);
        c2.add(100);

        Iterator it2 = c2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
