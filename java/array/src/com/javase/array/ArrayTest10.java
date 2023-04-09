package com.javase.array;

public class ArrayTest10 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //取出上面二维数组的第一个一维数组
        int[] a1 = array[0];

        //输出二维数组中第一个一维数组的第一个元素
        System.out.println(a1[0]);
        //合并代码
        System.out.println(array[0][0]);

        /*int a2 = a1[0];
        System.out.println(a2);*/

        //试着遍历第一个一维数组
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
        //优化遍历
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
