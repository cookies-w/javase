package com.company.javase.collection;

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();
        vips.add(new Vip("zhangsi", 20));
        vips.add(new Vip("zhangsan", 20));
        vips.add(new Vip("king", 18));
        vips.add(new Vip("soft", 17));
        for(Vip vip : vips){
            System.out.println(vip);
        }
    }
}

class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*compareTo 方法的返回值很重要：
    返回 0 表示相同，value 会覆盖。
    返回>0，会继续在右子树上找。【10 - 9 = 1 ，1 > 0 的说明左边这个数字比较大。
    所以在右子树上找。】
    返回<0，会继续在左子树上找。*/

    @Override
    public int compareTo(Vip v) {
        // 写排序规则，按照什么进行比较。
        if(this.age == v.age){
            // 年龄相同时按照名字排序。
            // 姓名是 String 类型，可以直接比。调用 compareTo 来完成比较。
            return this.name.compareTo(v.name);
        } else {
            // 年龄不一样
            return this.age - v.age;
        }
    }
}
