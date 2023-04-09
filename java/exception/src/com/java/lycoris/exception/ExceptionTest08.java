package com.java.lycoris.exception;
/*
* 异常对象的两个非常重要的方法
*
*  获取异常简单的描述信息
*     String msg = exception。getMessage
*
*   打印异常追踪的堆栈信息
*      exception.printStackTrace();
* */
public class ExceptionTest08 {
    public static void main(String[] args) {
        NullPointerException npe = new NullPointerException("空指针异常");
        // 获取异常简单描述信息：这个信息实际上就是构造方法上面String参数。
        String s = npe.getMessage();
        System.out.println(s);

        npe.printStackTrace();
        System.out.println("hello world");
    }
}
