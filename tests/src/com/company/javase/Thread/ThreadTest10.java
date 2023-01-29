package com.company.javase.Thread;

public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunable4 r = new MyRunable4();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        // 模拟 5 秒
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 终止线程
        // 你想要什么时候终止 t 的执行，那么你把标记修改为 false，就结束了。
        r.run = false;

    }
}

class MyRunable4 implements Runnable {
    // 打一个布尔标记
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                // return 就结束了，你在结束之前还有什么没保存的。
                // 在这里可以保存呀。
                //save....
                //终止当前线程
                return;
            }
        }
    }
}