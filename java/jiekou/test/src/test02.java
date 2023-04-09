/*
 * Copyright (c) lycoris
 * Email:lycoriskang@outlook.com
 * QQ:3067027828
 */

public class test02 {
    public static void main(String[] args) {
//        接口是完全抽象的
//        接口支持多继承
//        接口中只有常量和抽象方法

        //访问接口中的常量
        System.out.println(Math.PI);
        //常量无法重新赋值
//        Math.PI = 333;
    }
}

interface A1{

}
interface A2{

}

interface A3 extends A2, A1 {

}

interface Math {
    double PI = 3.14159;
    /*
    因为是接口中都是抽象public abstract可以省略
    * */
//    public abstract int add(int a, int b);
    int add(int a, int b);
    int sub(int a,int b);
}