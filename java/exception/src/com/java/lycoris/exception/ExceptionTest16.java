package com.java.lycoris.exception;
/*
MyStack测试
 */
public class ExceptionTest16 {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        //压栈
        try {
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            ms.push(new Object());
            //前十个可以下一个栈满了，会出异常
            ms.push(new Object());
        } catch (MyStackOperationException e) {
            //e.printStackTrace();
            String mss = e.getMessage();
            System.out.println(mss);
        }
        //弹栈
        try {
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            ms.pop();
            //弹栈失败
            ms.pop();
        }catch (MyStackOperationException e) {
            e.printStackTrace();
        }
    }
}
