package fx2023_3_26;

public class floOrDou {
    public static void main(String[] args) {
        float f = 2.7f;
        double d = 8.1/3;
        System.out.println(f==d);
        System.out.println(f+"\n"+d);
        System.out.println("--------------");
        if(Math.abs(f-d)<0.0000001){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }
}
