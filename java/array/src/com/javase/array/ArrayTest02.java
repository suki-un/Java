package com.javase.array;

public class ArrayTest02 {
    public static void main(String[] args) {
        //动态初始化数组
        int[] a = new int[4];
        //遍历数组
        for (int i = 0; i < a.length; i++) {
            System.out.println("数组上下标" + i + "为的值为" + a[i]);
        }
        //动态初始Object类型的数组
        Object[] b = new Object[4];
        //遍历数组
        for(int i =0; i<b.length;i++){
            System.out.println("数组上下标"+i+"为的值为"+b[i]);
        }
        //静态Object类型的数组
        Object[] c ={new Object(),new Object(),new Object()};
        //遍历数组
        for (int i = 0; i < c.length; i++) {
            System.out.println("数组上下标"+i+"为的值为"+c[i]);
        }
    }
}
