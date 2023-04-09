import java.util.Scanner;

/*
* 1、根据指定月份，打印该月份所属的季节。
	3,4,5 春季
	6,7,8 夏季
	9,10,11 秋季
	12, 1, 2 冬季

	if和switch各写一版

2、从键盘接收一个数字，判断该数字的正负。

3、从键盘接收一个数字，判断该数字的奇偶。

4、整数大小比较：输入两个整数，比较大小，
	若x>y 输出 >
	若x=y 输出 =
	若x<y 输出 <

5、编写程序，由键盘输入三个整数分别存入变量num1,num2,num3中，对它们进行排序，
使用if-else结构，并按从小到大的顺序输出

6、打车起步价8元（3KM以内）
超过3KM，超出的每公里1.2元
超过5KM，超出的每公里1.5元
请在键盘上接收公里数，得出总价。*/
public class Day08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //第一题
        System.out.print("请输入月份：");
        int mon = scn.nextInt();
        Season s = new Season();
        s.print(mon);

        //第二题
        System.out.print("请输入一个数：");
        double num = scn.nextDouble();
        Num n = new Num();
        n.print(num);

        //第三题
        System.out.print("请输入另一个数：");
        double dou = scn.nextDouble();
        new Parity().print(dou);

        //第四题目
        System.out.print("请输入第一个整数：");
        int num1 = scn.nextInt();
        System.out.print("请输入第二个整数：");
        int num2 = scn.nextInt();
        new Size().print(num1, num2);

        //第五题
        System.out.print("请输入第一个整数：");
        int num01 = scn.nextInt();
        System.out.print("请输入第二个整数：");
        int num02 = scn.nextInt();
        System.out.print("请输入第三个整数：");
        int num03 = scn.nextInt();
        new Sort().print(num01,num02,num03);

        //第六题
        /*
        * 6、打车起步价8元（3KM以内）
            超过3KM，超出的每公里1.2元
            超过5KM，超出的每公里1.5元
            请在键盘上接收公里数，得出总价*/
        System.out.print("请输入公里数：");
        double parity = scn.nextDouble();
        new Calculation().Math(parity);
    }
}

class Season {
    void print(int num) {
        if (num >= 1 && num <= 3) {
            System.out.println("春天");
        }else if(num >= 4 && num <= 6){
            System.out.println("夏天");
        }else if(num >= 7 && num <= 9){
            System.out.println("秋天");
        }else if(num >= 10 && num <= 12){
            System.out.println("冬天");
        }else{
            System.out.println("输入错误");
        }
    }
}


class Num{
    void print(double i){
        if (i >= 0) {
            System.out.println("正数");
        }else {
            System.out.println("负数");
        }
    }
}

class Parity{
    void print(double i){
        if (i % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}

class Size {
    void print(int num1, int num2){
        if (num1 > num2) {
            System.out.println(">");
        } else if (num1 == num2) {
            System.out.println("=");
        }else {
            System.out.println("<");
        }
    }
}

class Sort{
    void print(int num1 ,int num2 ,int num3){
        /*int max;
        if (num1 > num2 && num3 > num2) {
            if (num1 > num3) {
                max = num1;
                num1 = num2;
                num2 = num3;
                num3 = max;
            }else {
                max = num3;
                num3 = num2;
                num2 = num1;
                num1 = max;
            }
        }
        System.out.println(num3+" "+ num2+" "+num1);*/
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num2 + " "+num3 + " "+num1);
            }else {
                System.out.println(num2 + " "+num1 + " "+num3);
            }
        }else {
            if (num2 > num3){
                System.out.println(num1 + " "+num3 + " "+num2);
            }else {
                System.out.println(num1 + " "+num2 + " "+num3);
            }
        }
    }
}


class Calculation{
    /*
     * 6、打车起步价8元（3KM以内）
         超过3KM，超出的每公里1.2元
         超过5KM，超出的每公里1.5元
         请在键盘上接收公里数，得出总价*/
    void Math(double b){
        if (b < 3) {
            System.out.println("8元");
        }else if (b >= 3 && b <= 5) {
            double yuan = (b-3)*1.2 + 8;
            System.out.println(yuan+"元");
        }else if (b >= 5){
            double yuan = (b -5) * 1.5 + (3*1.2) + 8;
            System.out.println(yuan + "元");
        }
    }
}