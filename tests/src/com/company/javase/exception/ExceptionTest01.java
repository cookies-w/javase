package com.company.javase.exception;

public class ExceptionTest01 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        int c = a / b;
//        System.out.println(c); // ArithmeticException: / by zero

        // 通过“异常类”实例化“异常对象”
        NumberFormatException nfe = new NumberFormatException("数字格式化异常！");
        // java.lang.NumberFormatException: 数字格式化异常！
        System.out.println(nfe);

        // 通过“异常类”创建“异常对象”
        NullPointerException npe = new NullPointerException("空指针异常发生了！");
        //java.lang.NullPointerException: 空指针异常发生了！
        System.out.println(npe);

    }
}
