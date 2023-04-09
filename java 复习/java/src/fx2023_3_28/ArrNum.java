package fx2023_3_28;

public class ArrNum {
    public static void main(String[] args) {
        String[] you = {"你","爸爸","妈妈"};
        String[] me = you;
        for (String s : you) {
            System.out.print(s+"\t");
        }
        System.out.println();
        for (String s: me) {
            System.out.print(s+"\t");
        }

        System.out.println();

//      数组修改的内存地址的位置
        me[0] = "你好";
        for (String s : you) {
            System.out.print(s+"\t");
        }
        System.out.println();
        for (String s: me) {
            System.out.print(s+"\t");
        }
    }
}
