package fx2023_3_28;

public class ForUse {
    public static void main(String[] args) {
       /* for (int i = 0; i < 10; i++) {
            System.out.println("i = "+i);
        }*/


        /*int i = 0;
        for (; i < 10; ) {
            i++;
        }
        System.out.println("i = "+i);*/

        //1-100取出9的倍数 求有多少个 并且 这些数相加等于多少
        int shu = 0;
        int he = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                shu++;
                he += i;
            }
        }
        System.out.println(shu +"\n" + he);
    }
}
