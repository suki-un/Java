package fx2023_3_28;

import java.util.Scanner;

public class SwitchScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = scan.nextDouble();
        char grade = ' ';
        if (score >=90 && score <=100) {
            grade = 'A';
        }else if (score >= 60 && score < 90){
            grade = 'B';
        }else if (score >= 0 && score < 60){
            grade = 'C';
        }
        switch (grade) {
            case 'A':
                System.out.println("成绩优秀");
                break;
            case 'B':
                System.out.println("成绩及格");
                break;
            case 'C':
                System.out.println("成绩不及格");
                break;
            default:
                System.out.println("输入错误");
                break;

        }
    }
}
