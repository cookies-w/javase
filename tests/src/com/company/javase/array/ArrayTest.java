package com.company.javase.array;

public class ArrayTest {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("使用该系统时请输入程序参数，参数中包括用户名和密码");
            return;
        }
        String username = args[0];
        String pwd = args[1];
//        if(username.equals("admin") && pwd.equals("123456")){
        if("admin".equals(username) && "123456".equals(pwd)){
            System.out.println("登录成功，欢迎 [ " + username + " ] 回来");
            System.out.println("请继续使用本系统......");
        }else{
            System.out.println("验证失败，用户名不存在或密码错误！");
        }
    }
}
