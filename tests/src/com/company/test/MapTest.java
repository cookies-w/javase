package com.company.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapTest {

    public static void main(String[]args){
        List<String> list1 = new ArrayList<String>();
        list1.add("apple");
        list1.add("banana");
        list1.add("pina");
        
        List<String> list2 = new ArrayList<String>();
        list2.add("apple");
//        list2.add("milk");
        if(!list1.containsAll(list2)){
            System.out.println("不包含");
        }else {
            System.out.println("包含");
        }

        //交集
        List<String> collect1 = list1.stream().filter(num -> list2.contains(num))
                .collect(Collectors.toList());
        System.out.println("交集: " + collect1);
//    collect1.stream().forEach(System.out::println);

        //差集 list1-list2
        List<String> collect2 = list1.stream().filter(num -> !list2.contains(num))
                .collect(Collectors.toList());
        System.out.println("addList 即差集list1-list2: " + collect2);
//    collect2.stream().forEach(System.out::println);

        //差集list2-list1
        List<String> collect3 = list2.stream().filter(num -> !list1.contains(num))
                .collect(Collectors.toList());
        System.out.println("delList 即差集list2-list1: " + collect3);
//    collect3.stream().forEach(System.out::println);

        //并集  不去重
        list1.addAll(list2);
        System.out.println("并集 不去重: " + list1);
//    list1.stream().forEach(System.out::println);

        //并集  去重
        List<String> collect4 = list1.stream().distinct().collect(Collectors.toList());
        System.out.println("并集 去重: " + collect4);
//    collect4.stream().forEach(System.out::println);
    }
}
