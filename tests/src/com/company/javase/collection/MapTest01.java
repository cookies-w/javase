package com.company.javase.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        // 创建 Map 集合对象
        Map<Integer, String> map = new HashMap<>();
        // 向 Map 集合中添加键值对
        map.put(1, "zhangsan"); // 1 在这里进行了自动装箱。
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");
        // 通过 key 获取 value
        String value = map.get(2);
        System.out.println(value);
        // 获取键值对的数量
        System.out.println("键值对的数量：" + map.size());
        // 通过 key 删除 key-value
        map.remove(2);
        System.out.println("键值对的数量：" + map.size());

        // 判断是否包含某个 key
        // contains 方法底层调用的都是 equals 进行比对的，所以自定义的类型需要重写equals 方法。
        System.out.println(map.containsKey(new Integer(4))); // true
        // 判断是否包含某个 value
        System.out.println(map.containsValue(new String("wangwu"))); // true

        // 获取所有的 value
        Collection<String> values = map.values();
        // foreach
        for(String s : values){
            System.out.println(s);
        }

        // 清空 map 集合
        map.clear();
        System.out.println("键值对的数量：" + map.size());
        // 判断是否为空
        System.out.println(map.isEmpty()); // true
    }
}
