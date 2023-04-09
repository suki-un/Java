package fx2023_3_28;

public class DiGuiMethod {
    public static void main(String[] args) {
        Num num = new Num();
        num.method(5);
    }
}

class Num{
    void method(int num) {
        if (num > 2) {
            method(num -1);
        }
        System.out.println(num);
    }
}
