package fx2023_3_28;

public class DiGui2Method {
    public static void main(String[] args) {
        Number2 n = new Number2();
        System.out.println(n.method(5));
    }
}

class Number2 {
    public int method(int a){
        if(a == 1){
            return 1;
        }else {
            return method(a-1)*a;
            // 20
        }
    }
}