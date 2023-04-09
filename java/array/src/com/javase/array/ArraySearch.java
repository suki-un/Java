package com.javase.array;

public class ArraySearch {
    public static void main(String[] args) {
        //查找数组中的元素下标
        /*int[] arr = {1, 23, 76, 3245, 34};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 76) {
                System.out.println("元素87的下标找到了是"+i);
                return;
            }
        }
        //程序运行到这里代表没有76这个元素
        System.out.println("没有76这个元素");*/

        //用封装好的方法
        int[] arr = {1, 78, 69, 4564, 34};
        // 查找数组中的元素下标
        int i = arrayScearch(arr,78);
        System.out.println(i==-1?"不存在":"已查到元素下标为"+i);
    }

    /**
     * 从数组检索某个元素的下标
     * @param arr 被检索的数组
     * @param i 需要检索下标的元素
     * @return 检索的下标
     */
    public static int arrayScearch(int[] arr, int i) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                return j;
            }
        }
        return -1;
    }
}
