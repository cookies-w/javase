package com.company.javase.enum2;

public class EnumTest02 {
    public static void main(String[] args) {

        Result result = divide(10, 2);
        System.out.println(result == Result.SUCCESS ? "计算成功" : "计算失败");

        Result result2 = divide(10, 0);
        System.out.println(result2 == Result.SUCCESS ? "计算成功" : "计算失败");

    }

    public static Result divide(int a, int b){
        try{
            int c = a / b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }

    //枚举
    enum Result {
        SUCCESS, FAIL
    }

}

