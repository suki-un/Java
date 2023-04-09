package com.javase.array;

import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = {1,2,43,456,34,22,26};
        //排序
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //二分法查找
        int a = Arrays.binarySearch(arr,34);
        System.out.println(a==-1?"该元素不存在":"找到下标是："+a);
    }
}
