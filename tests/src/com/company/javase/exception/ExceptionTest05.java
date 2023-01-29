package com.company.javase.exception;

public class ExceptionTest05 {
    public static void main(String[] args) {
        // 创建异常对象（只 new 了异常对象，并没有手动抛出）
        MyException e = new MyException("用户名不能为空！");
        // 打印异常堆栈信息
        e.printStackTrace();
        // 获取异常简单描述信息
        String msg = e.getMessage();
        System.out.println(msg);

    }
}
