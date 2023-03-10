package com.company.javase.annotation7;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception{
        // 获取类
        Class userClass = Class.forName("com.company.javase.annotation7.User");
        // 判断类上是否存在 Id 注解
        if(userClass.isAnnotationPresent(MustHasIdPropertyAnnotation.class)){
            // 当一个类上面有@MustHasIdPropertyAnnotation 注解的时候，要求类中必须存在 int 类型的 id 属性
            // 如果没有 int 类型的 id 属性则报异常。
            // 获取类的属性
            Field[] fields = userClass.getDeclaredFields();
            boolean isOk = false; // 给一个默认的标记
            for(Field field : fields){
                if("id".equals(field.getName()) &&
                        "int".equals(field.getType().getSimpleName())){
                    // 表示这个类是合法的类。有@Id 注解，则这个类中必须有 int 类型的id
                            isOk = true; // 表示合法
                    break;
                }
            }

            // 判断是否合法
            if(!isOk){
                throw new HasNotIdPropertyException("被@MustHasIdPropertyAnnotation 注解标注的类中必须要有一个 int 类型的 id 属性！");
            }

        }
    }
}
