package com.java.lycoris.exception;

public class ExceptionTest05 {
    //第一种处理方式在方法声明的位置上继续使用throws来完成异常的继续上抛，抛给调用者（main继续上抛给jvm）
    /*public static void main(String[] args) throws ClassNotFoundException {
        dosome();
    }*/

    //第二种处理方法try..catch进行捕捉
    public static void main(String[] args) {
        try {
            dosome();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void dosome() throws ClassNotFoundException {
        System.out.println("dosome!!");
    }
}
