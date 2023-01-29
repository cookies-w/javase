package com.company.javase.exception;

public class ExceptionTest03 {
    public static void main(String[] args) {
//        try {
//            System.out.println("try...");
//            return;
//        } finally {
//            // finally 中的语句会执行。能执行到。
//            System.out.println("finally...");
//        }
        //System.out.println("hello world");

        try {
            System.out.println("try...");
            System.exit(0);
        } finally {
            // finally 中的语句会执行。能执行到。
            System.out.println("finally...");
        }
    }
}
