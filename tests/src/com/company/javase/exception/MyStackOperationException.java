package com.company.javase.exception;

public class MyStackOperationException extends Exception{ // 编译时异常！
    public MyStackOperationException(){
    }
    public MyStackOperationException(String s){
        super(s);
    }
}
