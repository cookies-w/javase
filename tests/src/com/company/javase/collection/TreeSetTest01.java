package com.company.javase.collection;

import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        Person p1 = new Person(32);
        //System.out.println(p1);
        Person p2 = new Person(20);
        Person p3 = new Person(30);
        Person p4 = new Person(25);

        // 创建 TreeSet 集合
        TreeSet<Person> persons = new TreeSet<>();
        // 添加元素
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        // 遍历
        for (Person p : persons){
            System.out.println(p);
        }

    }
}

class Person {
    int age;
    public Person(int age){
        this.age = age;
    }
    // 重写 toString()方法
    public String toString(){
        return "Person[age="+age+"]";
    }
}

