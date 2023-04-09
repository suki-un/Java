package com.javase.array;

public class ArrayTest04 {
    public static void main(String[] args) {
        printArray(new int[] {
            1, 2, 3, 4, 5
        });
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
