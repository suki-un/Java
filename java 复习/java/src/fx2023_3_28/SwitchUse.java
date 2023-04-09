package fx2023_3_28;

import java.util.Scanner;

public class SwitchUse {
    public static void main(String[] args) {
        System.out.println("请输入一个字符（a-c）：");
        Scanner scan = new Scanner(System.in);
        String c = scan.next();
        switch (c) {
            case "a":
                System.out.println("A");
                break;
            case "b":
                System.out.println("B");
                break;
            case "c":
                System.out.println("C");
                break;
            default:
                System.out.println("Default");
        }
        System.out.println("退出switch");
    }
}
