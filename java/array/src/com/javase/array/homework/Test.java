package com.javase.array.homework;

public class Test {
    public static void main(String[] args) {
        Room room = new Room(12,"1001",false);
        Room room2 = new Room(12,"1001",true);
        Room room3 = new Room(13,"1001",false);
        boolean b = room.equals(room2);
        System.out.println(b);
        System.out.println(room.equals(room3));
        System.out.println(room2.equals(room3));
    }
}
