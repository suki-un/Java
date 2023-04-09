package com.javase.array;

/*遍历二维数组*/
public class ArrayTest11 {
    public static void main(String[] args) {
        String[][] array = {
                {"java", "lll"},
                {"home", "qqs"},
                {"hello", "aaa"},
        };
        //遍历
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
