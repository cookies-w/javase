package com.company.javase.exception;

public class ExceptionTest04 {
    public static void main(String[] args) {
        int result = m();
        System.out.println(result); //100
    }
    public static int m(){
        int i = 100;
        try {
            return i;
        } finally {
            i++;
        }
    }
}
