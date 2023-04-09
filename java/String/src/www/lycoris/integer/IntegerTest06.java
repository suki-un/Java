package www.lycoris.integer;

/*
Integer常用方法
 */
public class IntegerTest06 {
    public static void main(String[] args) {

        //手动装箱
        Integer i = new Integer(100);

        //手动拆箱
        int y = i.intValue();
        System.out.println(y);

        //Integer能new字符串吗
        //java.lang.NumberFormatException
        //Integer i2 = new Integer("中文");
        //System.out.println(i2.intValue());


        //static int parseInt(String s)
        //将字符串参数解析为带符号的十进制整数.
        int returnValue = Integer.parseInt("123");
        //java.lang.NumberFormatException
        //文字转数字会出现异常，数字格式异常
        /*int returnValue2 =Integer.parseInt("你好");
        System.out.println(returnValue2);*/
        System.out.println(returnValue+100);

        double d = Double.parseDouble("100.1");
        System.out.println(d+returnValue);

        //valueOf(int i)
        //返回一个 Integer指定的 int值的 Integer实例。
        Integer a = Integer.valueOf(200);
        Integer a2 = Integer.valueOf("200");
        System.out.println(a.equals(a2));

    }
}

