package com.javase.array;

public class ArrayTest03 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        printArray(array);

        String[] str = {"111", "222" , "haha" , "lala"};
        printArray(str);

        String[] str1 = new String[7];
        printArray(str1);
        //printArray(new String[12]);
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("数组上下标"+i+"为的值为"+array[i]);
        }
    }
    public static void printArray(String[] strs){
        for (int i = 0; i < strs.length; i++) {
            System.out.println("数组上下标"+i+"为的值为"+strs[i]);
        }
    }
}
