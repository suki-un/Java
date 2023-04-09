package com.javase.array.homework;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("欢迎使用酒店管理系统！");
        System.out.println("请输入对应功能：[1]查询房间列表及状态，[2]订房，[3]，退房，[4]退出。");
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入：");
        int a = scan.nextInt();

        Room rooms = new Room();
        Hotel hotel = new Hotel();
        if (a == 1) {
            hotel.print();
        }else if (a == 2) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你想要的房间号，如果想查询空闲房间号请输入1，退出请输入4");
            int b = sc.nextInt();
            if (b == 1) {
                hotel.print();
            }else if (b == 4) {
                System.out.println("谢谢使用！");
            }else {
                hotel.oder(b);
            }
        }else if (a == 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你想退订的房间号，退出请输入4");
            int b = sc.nextInt();
            if (b == 4) {
                System.out.println("欢迎使用！");
            } else {
                hotel.exit(b);
            }


        }else if (a == 4) {
            System.out.println("谢谢使用！");
        }else {
            System.out.println("输入有误请仔细阅读!!!");
            return;
        }

    }
}
