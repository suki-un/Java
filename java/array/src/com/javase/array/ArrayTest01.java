package com.javase.array;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = new int[4];
        String[] str1 = {"11", "22", "33"};
        String[] str = new String[5];

/*
        System.out.println(array.length);
        System.out.println(array2.length);
        System.out.println(str1.length);
        System.out.println(str.length);
        System.out.println(array[0]);
        System.out.println(array2[0]);
        System.out.println(str1[0]);
        System.out.println(str[0]);

        System.out.println(array[array.length - 2]);

        //把第一个元素修改成111,最后一个修改成132
        array[0] = 111;
        array[array.length - 1] = 132;
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);
*/
        //遍历array的元素
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //反向遍历array的元素
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("颠倒顺序输出" + array[i]);
        }


    }
}
