package com.javase.array;

public class ArrayTest05 {
    public static void main(String[] args) {
        System.out.println("JVM给main方法传的参数是："+ args.length);//JVM给main方法传的参数是：0
        //String[] str = new String[0];
        /*String[] str = {};
        printArray(str);*/
        //遍历数组
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void printArray(String[] args) {
        System.out.println(args.length);
    }
}
