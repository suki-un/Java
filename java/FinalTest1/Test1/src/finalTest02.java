public class finalTest02 {
    public static void main(String[] args) {
        /*
        final修饰的变量只能附一次值
        * */
        int a = 10;
        a = 20;
        System.out.println(a);

        final int b = 20;
//        final修饰的局部变量一但附上之就不能重新分配
//        b = 30;
        System.out.println(b);

        final int c;
        c = 30;
//        只能赋值一次
//        c = 40;
        System.out.println(c);
    }
}
