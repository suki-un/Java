package com.java.lycoris.exception.homework;

public class Test {
    public static void main(String[] args) {
        UserServer server = new UserServer();
        try {
            server.register("zhangsan","99999");
        } catch (IllegalNameException e) {
            e.printStackTrace();
        }
    }
}
