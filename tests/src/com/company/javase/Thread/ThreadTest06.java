package com.company.javase.Thread;

public class ThreadTest06 {
    public static void main(String[] args) {
        // 让当前线程进入休眠，睡眠 5 秒
        // 当前线程是主线程！！！
       /* try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        // 5 秒之后执行这里的代码
        //System.out.println("hello world!");

        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "--->" + i);
            // 睡眠 1 秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
