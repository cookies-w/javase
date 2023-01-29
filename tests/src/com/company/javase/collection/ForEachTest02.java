package com.company.javase.collection;

import java.util.*;

public class ForEachTest02 {
    public static void main(String[] args) {
        // 创建 List 集合
        List<String> strList = new ArrayList<>();

        // 添加元素
        strList.add("hello");
        strList.add("world!");
        strList.add("kitty!");

        // 遍历，使用迭代器方式
        Iterator<String> it = strList.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        
        System.out.println("---------------");
        // 使用下标方式（只针对于有下标的集合）
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        System.out.println("===============");
        // 使用 foreach
        for (String s : strList) { // 因为泛型使用的是 String 类型，所以是：String s
            System.out.println(s);
        }

        System.out.println("_______________");
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        for (Integer i : list) { // i 代表集合中的元素
            System.out.println(i);
        }
    }
}
