package com.java.lycoris.exception;
/*
1、什么是异常，java提供异常处理机制有什么用？
    以下程序执行过程中发生了不正常的情况，而这种不正常的情况叫做：异常
    java语言是很完善的语言，提供了异常的处理方式，以下程序执行过程中出现了不正常情况，
    java把该异常信息打印输出到控制台，供程序员参考。程序员看到异常信息之后，可以对
    程序进行修改，让程序更加的健壮。

    什么是异常：程序执行过程中的不正常情况。
    异常的作用：增强程序的健壮性。

2、以下程序执行控制台出现了：
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.java.lycoris.exception.ExceptionTest01.main(ExceptionTest01.java:21)
	这个信息被我们称为：异常信息。这个信息是JVM打印的。
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        if (b == 0) {
            System.out.println("被除数不能为0");
            return;
        }
        //运行到这里就代表除数不为零
        int c = a / b;
        System.out.println(c);
    }
}
