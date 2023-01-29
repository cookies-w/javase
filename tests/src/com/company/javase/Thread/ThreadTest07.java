package com.company.javase.Thread;

public class ThreadTest07 {
    public static void main(String[] args) {
        // 创建线程对象
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        // 调用 sleep 方法
        try {
            // 问题：这行代码会让线程 t 进入休眠状态吗？
            t.sleep(1000 * 5); // 在执行的时候还是会转换成：Thread.sleep(1000 * 5);
            // 这行代码的作用是：让当前线程进入休眠，也就是说 main 线程进入休眠。
            // 这样代码出现在 main 方法中，main 线程睡眠。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5 秒之后这里才会执行。
        System.out.println("hello World!");
    }
}

class MyThread3 extends Thread {
    public void run(){
        for(int i = 0; i < 10000; i++){
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
