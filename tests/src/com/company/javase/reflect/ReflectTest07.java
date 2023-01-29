package com.company.javase.reflect;

import com.company.javase.bean.Student;

import java.lang.reflect.Field;

public class ReflectTest07 {
    public static void main(String[] args) throws Exception{
        // 我们不使用反射机制，怎么去访问一个对象的属性呢？
        Student s = new Student();

        //给属性赋值
        s.no = 1111; //三要素：给 s 对象的 no 属性赋值 1111
                     //要素 1：对象 s
                     //要素 2：no 属性
                     //要素 3：1111

        // 读属性值
        // 两个要素：获取 s 对象的 no 属性的值。
        System.out.println(s.no);

        // 使用反射机制，怎么去访问一个对象的属性。（set get）
        Class studentClass = Class.forName("com.company.javase.bean.Student");
        Object obj = studentClass.newInstance(); // obj 就是 Student 对象。（底层调用无参数构造方法）

        // 获取 no 属性（根据属性的名称来获取 Field）
        Field noFiled = studentClass.getDeclaredField("no");

        // 给 obj 对象(Student 对象)的 no 属性赋值
        /*
        虽然使用了反射机制，但是三要素还是缺一不可：
        要素 1：obj 对象
        要素 2：no 属性
        要素 3：2222 值
        注意：反射机制让代码复杂了，但是为了一个“灵活”，这也是值得的。
        */
        noFiled.set(obj, 22222); // 给 obj 对象的 no 属性赋值 2222

        // 读取属性的值
        // 两个要素：获取 obj 对象的 no 属性的值。
        System.out.println(noFiled.get(obj));

        // 可以访问私有的属性吗？
        Field nameField = studentClass.getDeclaredField("name");

        // 打破封装（反射机制的缺点：打破封装，可能会给不法分子留下机会！！！）
        // 这样设置完之后，在外部也是可以访问 private 的。
        nameField.setAccessible(true);

        // 给 name 属性赋值
        nameField.set(obj, "jackson");
        // 获取 name 属性的值
        System.out.println(nameField.get(obj));


    }
}
