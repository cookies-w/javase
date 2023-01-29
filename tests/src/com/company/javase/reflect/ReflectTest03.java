package com.company.javase.reflect;

import java.io.FileReader;
import java.util.Properties;

public class ReflectTest03 {
    public static void main(String[] args) throws Exception{
        // 这种方式代码就写死了。只能创建一个 User 类型的对象
        //User user = new User();

        // 以下代码是灵活的，代码不需要改动，可以修改配置文件，配置文件修改之后，可以创建出不同的实例对象。
        // 通过 IO 流读取 classinfo.properties 文件
        FileReader reader = new FileReader("tests/classinfo.properties");
        // 创建属性类对象 Map
        Properties pro = new Properties(); // key value 都是 String
        // 加载
        pro.load(reader);
        // 关闭流
        reader.close();

        // 通过 key 获取 value
        String className = pro.getProperty("className");
        //System.out.println(className);

        // 通过反射机制实例化对象
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);

    }
}
