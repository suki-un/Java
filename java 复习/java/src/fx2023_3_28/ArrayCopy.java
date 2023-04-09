package fx2023_3_28;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = {0,1,2};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
