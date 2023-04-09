package www.lycoris.number;
/*
BigDecimal 属于大数据，精度极高，不属于基本数据类型，属于Java对象（应用数据类型）
这是SUN提供的一个类。专门用于财务软件当中
* */

import java.math.BigDecimal;

public class BigDecimalTest01 {
    public static void main(String[] args) {
        //精度极高的100
        BigDecimal bd1 = new BigDecimal(100);
        //精度极高的200
        BigDecimal bd2 = new BigDecimal(200);
        //bd1+bd2不行要调add方法
        BigDecimal bd3 = bd1.add(bd2);//精度极高的300
        System.out.println(bd3);

        BigDecimal bd4 = bd3.divide(bd1);
        System.out.println(bd4);//除法
    }
}
