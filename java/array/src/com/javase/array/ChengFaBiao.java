package com.javase.array;
//不会，乘法表，废弃了
public class ChengFaBiao {
    public static void main(String[] args) {
        int[][] a ={
                {1},
                {1,2},
                {1,2,3},
                {1,2,3,4},
                {1,2,3,4,5},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6,7},
                {1,2,3,4,5,6,7,8},
                {1,2,3,4,5,6,7,8,9},

        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
