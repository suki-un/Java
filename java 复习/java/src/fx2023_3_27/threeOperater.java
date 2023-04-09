package fx2023_3_27;

public class threeOperater {
    public static void main(String[] args) {
        int a =20;
        int b =100;
        int c =40;
        //求出最大值
        int max1 = a>b ? a: b;
        int max2 = max1 > c ? max1: c;
        System.out.println("最大值是："+max2);
    }
}
