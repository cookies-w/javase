package com.company.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest03 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();
        // 创建用户对象
        User u1 = new User("jack");
        // 加入集合
        c.add(u1);
        // 判断集合中是否包含 u2
        User u2 = new User("jack");
        // 没有重写 equals 之前：这个结果是 false
        //System.out.println(c.contains(u2)); // false
        // 重写 equals 方法之后，比较的时候会比较 name。
        System.out.println(c.contains(u2)); // true

    }
}

class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    // 重写 equals 方法
    // 将来调用 equals 方法的时候，一定是调用这个重写的 equals 方法。
    // 这个 equals 方法的比较原理是：只要姓名一样就表示同一个用户。
    public boolean equals(Object o) {
        if (o == null || !(o instanceof User)) return false;
        if (o == this) return true;
        User u = (User) o;
        // 如果名字一样表示同一个人。（不再比较对象的内存地址了。比较内容。）
        return u.name.equals(this.name);
    }
}


