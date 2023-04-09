package com.java.lycoris.exception;

public class ExceptionTest12 {
    public static void main(String[] args) {
        try {
            System.out.println("try...");
            System.exit(0);//退出jvm推出后不继续执行finally也不行、
        }finally {
            System.out.println("finally.....");
        }
    }
}
