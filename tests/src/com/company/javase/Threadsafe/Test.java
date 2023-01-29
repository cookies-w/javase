package com.company.javase.Threadsafe;

public class Test {
    public static void main(String[] args) {
        // 创建账户对象（只创建 1 个）
//        Account act = new Account("act-001", 10000);

        Account2 act2 = new Account2("act2-001", 10000);

        // 创建两个线程
        Thread t1 = new AccountThread(act2);
        Thread t2 = new AccountThread(act2);
        // 设置 name
        t1.setName("t1");
        t2.setName("t2");
        // 启动线程取款
        t1.start();
        t2.start();
    }
}
