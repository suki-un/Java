package com.javase.array;

/*java中的二维数组
 * 二维数组就是特殊的一维数组
 * 特殊在二维数组里面的每一个元素是一个一维数组
 * 注；开发中使用最多的是一维数组，二维数组很少用，三维数组几乎不用*/
public class ArrayTest09 {
    public static void main(String[] args) {
        //一维数组
        int[] array = {1, 2, 3, 4};
        //二维数组
        int[][] array2 = {
                {1, 2},
                {1, 2},
                {1, 2}
        };
        /*for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }*/
        //三维数组
        int[][][] array3 = {{{1, 2}, {1, 2}},{{1, 2}, {1, 2}}};
        //同理有更多维数组......
    }
}
