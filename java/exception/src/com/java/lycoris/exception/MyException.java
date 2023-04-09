package com.java.lycoris.exception;

//public class MyException extends RuntimeException{}//运行时异常
public class MyException extends Exception{//编译时异常
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
