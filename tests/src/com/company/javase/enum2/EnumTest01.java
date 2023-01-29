package com.company.javase.enum2;

public class EnumTest01 {
    public static void main(String[] args) {
//        int result = divide(10, 2);
//        System.out.println(result);
//
//        int result2 = divide(10, 0);
//        System.out.println(result2);

        boolean result = divide(10, 2);
        System.out.println(result ? "计算成功" : "计算失败");

        boolean result2 = divide(10, 0);
        System.out.println(result2 ? "计算成功" : "计算失败");

    }

    /*public static int divide(int a, int b){
        try{
            int c = a / b;
            return 1;
        }catch (Exception e){
            return 0;
        }
    }*/

    public static boolean divide(int a, int b){
        try{
            int c = a / b;
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
