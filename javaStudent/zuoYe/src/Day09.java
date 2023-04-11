import java.util.Scanner;

/*
1、计算1000以内所有不能被7整除的整数之和

2、计算 1+2-3+4-5+6-7....+100的结果

3、从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1

4、从控制台接收一个正整数，判断该数字是否为质数
质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）

5、从键盘接收一个正整数，该正整数作为行数，输出以下图形
    *
   ***
  *****
 *******
*********
例如：输入5，则打印如上图5行。

6、小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。

7、一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
找出1000内所有的完数。

8、给一个不多于5位的正整数，
要求：
一、求它是几位数
二、逆序打印出各位数字
* */
public class Day09 {
    public static void main(String[] args) {
        //第一题
        /*1、计算1000以内所有不能被7整除的整数之和*/
        Divisor divisor = new Divisor();
        int a = divisor.div();
        System.out.println("1000以内所有不能被7整除的整数之和："+ a);

        //第二题
        /*2、计算 1+2-3+4-5+6-7....+100的结果*/
        System.out.println(new Math().math());

        //第三题
        /*3、从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1 */
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int input = scan.nextInt();
        int out = new Factorial().factorial(input);
        System.out.println(out);

        //第四题
        /*4、从控制台接收一个正整数，判断该数字是否为质数，质数（质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数）*/
        System.out.print("请输入一个正整数：");
        int input2 = scan.nextInt();
        boolean isPrime = new Prime().isPrime(input2);
        System.out.println(isPrime);
        scan.close();

        //第五题
        /*5、从键盘接收一个正整数，该正整数作为行数，输出以下图形
            *
           ***
          *****
         *******
        *********
        例如：输入5，则打印如上图5行。*/
        System.out.println("请输入一个正整数：");
        int input3 = scan.nextInt();
        int out2 = new Factorial().factorial(input3);

    }

}

class Divisor{
    public int div(){
        int he = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 7 == 0) {
                continue;
            }else {
                he += i;
            }
        }
        return he;
    }
}
class Math{
    public int math() {
        int he = 1;
        for (int i = 2; i <= 100; i++) {
            if(i % 2 == 0){
                he += i;
            }else {
                he -= i;
            }
        }
        return he;
    }
}

class Factorial{
    public int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
}

class Prime{
    public boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}