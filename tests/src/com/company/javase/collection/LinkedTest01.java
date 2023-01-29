package com.company.javase.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedTest01 {
    public static void main(String[] args) {
        // LinkedList 集合底层也是有下标的。
        // 注意：ArrayList 之所以检索效率比较高，不是单纯因为下标的原因。是因为底层数组发挥的作用。
        // LinkedList 集合照样有下标，但是检索/查找某个元素的时候效率比较低，因为只能从头节点开始一个一个遍历。
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        for(int i = 0; i <list.size(); i++){
            Object obj = list.get(i);
            System.out.println(obj);
        }
        // LinkedList 集合有初始化容量吗？没有。
        // 最初这个链表中没有任何元素。first 和 last 引用都是 null。
        // 不管是 LinkedList 还是 ArrayList，以后写代码时不需要关心具体是哪个集合。
        // 因为我们要面向接口编程，调用的方法都是接口中的方法。
        //List list2 = new ArrayList(); // 这样写表示底层你用了数组。
        List list2 = new LinkedList(); // 这样写表示底层你用了双向链表。
        // 以下这些方法你面向的都是接口编程。
        list2.add("123");
        list2.add("456");
        list2.add("789");
        for(int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }
    }
}
