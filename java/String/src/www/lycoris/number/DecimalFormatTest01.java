package www.lycoris.number;

import java.text.DecimalFormat;

/*
关于数字的格式化
* */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //###,###.##
        /*
        表示：加入千分位，保留两个小数。
        * */
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234.567897);
        System.out.println(s);

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s2 = df2.format(12345.6677);
        System.out.println(s2);

        DecimalFormat df3 = new DecimalFormat("###,###.###");
        String s3 = df3.format(12345.46);
        System.out.println(s3);
    }
}
