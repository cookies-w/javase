package com.company.javase.Threadsafe;

public class Account2 {

    // 账号
    private String actno;
    // 余额
    private double balance; //实例变量

    //对象
    Object obj = new Object(); // 实例变量。
    // （Account 对象是多线程共享的，Account 对象中的实例变量 obj 也是共享的。）


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

    public Account2() {
    }

    public Account2(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    //取款的方法
    public void withdraw(double money){
        // 以下这几行代码必须是线程排队的，不能并发。
        // 一个线程把这里的代码全部执行结束之后，另一个线程才能进来。

        /*这里的共享对象是：账户对象。
        账户对象是共享的，那么 this 就是账户对象吧！！！
        不一定是 this，这里只要是多线程共享的那个对象就行。*/

        //Object obj2 = new Object();
        synchronized (this){
        //synchronized (obj) {
        //synchronized ("abc") { // "abc"在字符串常量池当中。
        //synchronized (null) { // 报错：空指针。
        //synchronized (obj2) { // 这样编写就不安全了。因为 obj2 不是共享对象。
            double before = this.getBalance();
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }
    }
}
