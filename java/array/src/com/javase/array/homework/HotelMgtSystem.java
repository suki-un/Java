package com.javase.array.homework;

import java.util.Objects;
import java.util.Scanner;

/*第二题：（java软件工程师人生路上第一个小型项目。锻炼一下面向对象。）
    为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能。
    1、该系统的用户是：酒店前台。
    2、酒店使用一个二维数组来模拟。“Room[][] rooms;”
    3、酒店中的每一个房间应该是一个java对象：Room
    4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲.
    5、系统应该对外提供的功能：
        可以预定房间：用户输入房间编号，订房。
        可以退房：用户输入房间编号，退房。
        可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态。*/
public class HotelMgtSystem {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.print();

        Scanner roomNo = new Scanner(System.in);
        System.out.println("请输入要预定的房间编号：");
        h.oder(roomNo.nextInt());
        h.print();
    }
}

//酒店对象
class Hotel {
    //二维数组模拟房间
    private Room[][] rooms;
    //通过构造方法来盖楼

    public Hotel() {
        //this.rooms = rooms;
        rooms = new Room[3][10];
        for (int i = 0; i < rooms.length; i++) {//i是下标，i+1是楼层
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0) {
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
                } else if (i == 1) {
                    rooms[i][j] = new Room((i + 2) * 100 + j + 1, "双人间", true);
                } else {
                    rooms[i][j] = new Room((i + 3) * 100 + j + 1, "总统套房", true);
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.println(room.toString());
            }
        }
    }

    /**
     * 订房方法，调用此方法要传一个对象（房间号）过来
     *
     * @param roomNo
     */
    public void oder(int roomNo) {
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(false);
    }

    /**
     * 退房方法，调用此方法要传一个对象（房间号）过来
     */
    public void exit(int roomNo) {
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(true);
    }
}

//房间对象
class Room {
    //房号
    private int no;
    //房间类型
    private String type;
    //房间状态
    private boolean status;

    //构造方法
    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    //set和get方法
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //重写equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return no == room.no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }


    //重写toString

    @Override
    public String toString() {
        return "Room{" +
                "房号是:" + no +
                ", 房间类型是" + type +
                ", 状态:" + (status ? "空闲" : "占用") +
                '}';
    }
}