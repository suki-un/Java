package fx2023_3_28;

public class CoBrRe {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++){
            System.out.println(i);
            if (i == 2) {
                continue;
            }
            System.out.println("正在循环");
        }
        System.out.println("已经结束1循环");

        for (int i = 10; i < 14; i++) {
            System.out.println(i);
            if (i == 12 ) {
                break;
            }
            System.out.println("正在循环");
        }
        System.out.println("结束2循环");
    }
}
