package fx2023_3_27;

public class logicOperater {
    public static void main(String[] args) {
        // & && | || ! ^
        /*
        & 两个必须都为真才是真
        &&如果前面为false就不会执行后面的
        | 有一个为真就是真
        ||如果前面为true就不会执行后面的
        ！ 如果真取反为假，如果是假取反为真
        ^ 判断两个对象是否一样，如果不一样为真，一样为假
        * */
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;
        int i = 20;
        if(i<20 && i++>20){
            System.out.println("tt");
        }
        System.out.println(i);
    }
}
