package com.javase.array;

/*
模拟一个系统，假设这个系统要使用必须输入账号密码
* */
public class ArrayTest06 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用该系统要输入账号密码，例如:zhangsan 123");
            return;
        }
        //代码运行到此代表输入合法，开始判断账号和密码
        String Username = args[0];
        String Password = args[1];

        //假设用户名是admin密码是123
        //if(Username.equals("admin") && Password.equals("123")) {
        //键入内容在前容易出现空指针异常，所以把定义内容放前面（老程序员的经验）
        if("admin".equals(Username) && "123".equals(Password)){
            System.out.println("账号和密码正确");
            System.out.println("你可以继续使用该系统");
            return;
        }
        System.out.println("账号或密码错误");
    }
}
