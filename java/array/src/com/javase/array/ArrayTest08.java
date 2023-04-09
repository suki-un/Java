package com.javase.array;
/*
一维数组的扩容
* 在Java中数组长度一旦确定不可改变。
    数组满了扩容：
        新建一个大容量数组，将原有的数组拷贝过去
结论：数组扩容效率底，因为要进行拷贝，所以以后开发要经过可能创建合适的长度
* */
public class ArrayTest08 {
    public static void main(String[] args) {
        //数组拷贝方法
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 =new int[20];
        /*
        拷贝指定长度，指定位置
        System.arraycopy(arr,1,arr2,3,2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
         */
        //拷贝全部
        System.arraycopy(arr,0,arr2,0,arr.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
