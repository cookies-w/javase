package com.company.javase.Thread;

public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        // 希望 5 秒之后，t 线程醒来（5 秒之后主线程手里的活儿干完了。）
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 终断 t 线程的睡眠（这种终断睡眠的方式依靠了 java 的异常处理机制。）
        t.interrupt(); // 干扰，一盆冷水过去！
    }
}

class MyRunnable2 implements Runnable {
    // 重点：run()当中的异常不能 throws，只能 try catch
    // 因为 run()方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常。
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "---> begin");
        try {
            // 睡眠 1 年
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            // 打印异常信息
            //e.printStackTrace();
        }

        //1 年之后才会执行这里
        System.out.println(Thread.currentThread().getName() + "---> end");
    }
}

