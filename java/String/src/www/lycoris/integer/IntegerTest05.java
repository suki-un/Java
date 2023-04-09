package www.lycoris.integer;
/*
*
* 自动拆箱自动装箱*/
public class IntegerTest05 {
    public static void main(String[] args) {
        //基本数据类型--（自动转换）-->包装类型：自动转换
        Integer x = 900;

        //包装类型--（自动转换）-->基本数据类型：自动拆箱
        int y = x;
        System.out.println(y);

        Integer c = 1000;
        System.out.println(c+1);
    }
}
