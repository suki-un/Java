package com.java.lycoris.exception;

public class ExceptionTest11 {
    public static void main(String[] args){
        /*
        try和finally没有catch可以吗？可以
        */
        try {
            System.out.println("try...");
            return;
        }finally {
            System.out.println("finally.....");
        }
        //这里是执行不到的finally里的是可以执行到的
        //System.out.println();
    }
}
