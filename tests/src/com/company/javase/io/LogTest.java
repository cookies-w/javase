package com.company.javase.io;

import com.company.javase.io.Logger;

public class LogTest {
    public static void main(String[] args) throws Exception {
        //测试工具类是否好用
        Logger.log("调用了 System 类的 gc()方法，建议启动垃圾回收");
        Logger.log("调用了 UserService 的 doSome()方法");
        Logger.log("用户尝试进行登录，验证失败");
        Logger.log("我非常喜欢这个记录日志的工具哦！");
    }
}
