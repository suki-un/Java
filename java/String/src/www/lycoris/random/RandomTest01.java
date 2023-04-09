package www.lycoris.random;

import java.util.Random;

/*
* 随机数
* */
public class RandomTest01 {
    public static void main(String[] args) {
        //创建对象
        Random random = new Random();


        //产生一个int范围内的随机数
        int num1 = random.nextInt();
        System.out.println(num1);

        //创建一个999999范围内的随机数
        int num2 = random.nextInt(1000000);
        System.out.println(num2);

        //创建一个9-100范围内的随机数
        int num3 = random.nextInt(9,100);
        System.out.println(num3);

    }
}
