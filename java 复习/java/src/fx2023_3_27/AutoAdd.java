package fx2023_3_27;

public class AutoAdd {
    public static void main(String[] args) {
        int i = 1;
        int j;
        j = i++;//i++先把i=1赋值给j，再自加一
        System.out.println(j + "\n" + i);

        System.out.println("--------------");
        int I = 1;
//        I = ++I;
        I = I++;
        System.out.println(I);
    }
}
