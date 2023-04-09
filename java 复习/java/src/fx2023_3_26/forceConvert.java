package fx2023_3_26;

public class forceConvert {
    public static void main(String[] args) {
        //byte short int long float double boolean char
        int i= (int) 1.9;
        byte b = (byte) 20000;//精度丢失/数据溢出
        System.out.println(i+"\n"+b);
    }
}
