package com.java.lycoris.exception;

public class ExceptionTest15 {
    public static void main(String[] args){
        //创建异常对象
        //只是new了对象没有手动抛出
        MyException myException = new MyException("用户名不能为空");
        //打赢异常信息
        myException.printStackTrace();
        //获取消息
        String m = myException.getMessage();
        System.out.println(m);
    }
}
