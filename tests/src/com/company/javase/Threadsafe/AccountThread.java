package com.company.javase.Threadsafe;

public class AccountThread extends Thread{
    // 两个线程必须共享同一个账户对象。
//    private Account act;

    private Account2 act2;

    // 通过构造方法传递过来账户对象
//    public AccountThread(Account act) {
//        this.act = act;
//    }

    public AccountThread(Account2 act2) {
        this.act2 = act2;
    }

    public void run(){
        // run 方法的执行表示取款操作。
        // 假设取款 5000
        double money = 5000;
        // 取款
        // 多线程并发执行这个方法。
        act2.withdraw(money);

        System.out.println(Thread.currentThread().getName() + "对"+act2.getActno()+" " +
                "取款"+money+"成功，余额" + act2.getBalance());
    }

}
