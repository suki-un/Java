package www.lycoris.enum1;

public class EnumTest01 {
    public static void main(String[] args) {

        System.out.println(divide(2, 3));//1
        System.out.println(divide(2, 0));//0被除数不能为0


        //以下代码可以用，但返回值1和0
        int a = divide(2, 3);
        System.out.println(a==1?"正确":"异常");
        int b = divide(9, 0);
        System.out.println(b==1?"正确":"异常");
    }

    /**
     * 除法运算
     * @param a 除数
     * @param b 被除数
     * @return 返回1的表示正确，返回0表示出现异常
     */
    public static int divide(int a,int b){
        try {
            int c =a/b;
            return 1;
        }catch (Exception e) {
            return 0;
        }
    }
}
