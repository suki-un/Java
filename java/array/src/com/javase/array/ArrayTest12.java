package com.javase.array;
/*动态初始化二维数组*/
public class ArrayTest12 {
    public static void main(String[] args) {
        /*
        //定义一个三行二列的二维数组(三个一维数组，每个一维数组里面有两个元素)
        int[][] ary = new int[3][2];
        //遍历
        for (int i = 0; i < ary.length;i++) {
            for (int j = 0; j < ary[i].length; j++) {
                System.out.print(ary[i][j]+" ");
            }
            System.out.println();
        }*/
        int[][] ars = {
                {1, 2, 3, 4},
                {5,67,8,9},
                {6}
        };
        printArray(ars);
        //也可以这样写
        printArray(new int[][]{
                {1, 2, 3, 4},
                {5, 67, 8, 9},
                {6}
        });
    }
    //二维数组打印方法
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}