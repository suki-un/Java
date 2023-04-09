package com.java.lycoris.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
深入try..catch
    1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型。
    2、catch可以写多个。建议catch的时候，精确的一个一个处理。这样有利于程序的调试。
    3、catch写多个的时候，从上到下，必须遵守从小到大。
 */
public class ExceptionTest07 {
    /*
    public static void main(String[] args) throws Exception, FileNotFoundException, NullPointerException {

    }
     */

    /*public static void main(String[] args) throws Exception {

    }*/
    public static void main(String[] args) {

        //编译报错
        /*try {
            FileInputStream fis = new FileInputStream("D:\\course\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
        } catch(NullPointerException e) {

        }*/

        /*try {
            FileInputStream fis = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
            System.out.println("以上出现异常，这里无法执行！");
        } catch(FileNotFoundException e) {
            System.out.println("文件不存在！");
        }

        System.out.println("hello world!");*/

        /*try {
            FileInputStream fis = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
        } catch(IOException e) { // 多态：IOException e = new FileNotFoundException();
            System.out.println("文件不存在！");
        }*/

        /*try {
            FileInputStream fis = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
        } catch(Exception e) { // 多态：Exception e = new FileNotFoundException();
            System.out.println("文件不存在！");
        }*/

        /*try {
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
            //读文件
            fis.read();
        } catch(Exception e) { //所有的异常都走这个分支。
            System.out.println("文件不存在！");
        }*/

        /*try {
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
            //读文件
            fis.read();
        } catch(FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch(IOException e){
            System.out.println("读文件报错了！");
        }*/

        // 编译报错。
        /*
        try {
            //创建输入流
            FileInputStream fis = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
            //读文件
            fis.read();
        } catch(IOException e){
            System.out.println("读文件报错了！");
        } catch(FileNotFoundException e) {
            System.out.println("文件不存在！");
        }
         */

        //JDK8的新特性
        try {
            FileInputStream fis = new FileInputStream("D:\\curse\\02-JavaSE\\document\\JavaSE进阶讲义\\JavaSE进阶-01-面向对象.pdf");
            System.out.println(100/0);//运算异常，编写时可处理也可以不处理
        }catch (FileNotFoundException | ArithmeticException |NullPointerException e) {
            System.out.println("文件不存在？数学异常？空指针异常？都有可能！");
        }
    }
}
