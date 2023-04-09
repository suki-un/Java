package fx2023_3_28;

import java.util.Scanner;

public class SwitchSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入月份：");
        int mon = input.nextInt();
        char season = ' ';
        if(mon >= 1 && mon <= 3){
            season = 'A';
        } else if (mon > 3 && mon <= 6) {
            season = 'B';
        }else if (mon > 6 && mon <= 9) {
            season = 'C';
        }else if (mon > 9 && mon <= 12){
            season = 'D';
        }
        switch (season) {
            case 'A':
            System.out.println("春");
            break;
            case 'B':
            System.out.println("夏");
            break;
            case 'C':
            System.out.println("秋");
            break;
            case 'D':
            System.out.println("冬");
            break;
            default:
            System.out.println("输入有误");
        }
    }
}
