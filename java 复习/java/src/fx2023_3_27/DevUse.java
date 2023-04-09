package fx2023_3_27;

public class DevUse {
    public static void main(String[] args) {
        System.out.println(10/3);
        System.out.println(10.0/3);
        double d = 10 / 3;//10/3是两个整形得出整形3再赋值给double所以是3.0
        System.out.println(d);
        System.out.println("_____________________");
        /*取模（取余）*/
        System.out.println(10%3);
        System.out.println(-10%3);
        // a % b = a - (a / b * b)
        System.out.println(10%(-3));
        System.out.println(-10 % (-3));
    }
}
