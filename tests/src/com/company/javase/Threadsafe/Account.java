package com.company.javase.Threadsafe;

public class Account {
    // 账号
    private String actno;
    // 余额
    private double balance;

    public Account() {
    }
    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }
    public void setActno(String actno) {
        this.actno = actno;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款的方法
    public void withdraw(double money){
        // t1 和 t2 并发这个方法。。。。（t1 和 t2 是两个栈。两个栈操作堆中同一个对象。）
        // 取款之前的余额
        double before = this.getBalance(); // 10000
        // 取款之后的余额
        double after = before - money;
        // 在这里模拟一下网络延迟，100%会出现问题
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 更新余额
        // 思考：t1 执行到这里了，但还没有来得及执行这行代码，t2 线程进来 withdraw 方法了。此时一定出问题。
        this.setBalance(after);
    }
}
