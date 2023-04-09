package fx2023_3_27;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("输入一个数字");
        int a = scr.nextInt();
        System.out.println("你的年龄是"+ a);
        System.out.println("请输入小数");
        double b = scr.nextDouble();
        System.out.println("你的小数是"+b);
    }
}
