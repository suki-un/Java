package com.java.lycoris.exception;
/*
java语言中异常是以什么形式存在的呢？
    1、异常在java中以类的形式存在，每一个异常类都可以创建异常对象。
    2、异常对应的现实生活中是怎样的？
        火灾(异常类)：
            2008年8月8日,小明家着火了（异常对象）
            2008年8月9日,小刚家着火了（异常对象）
            2008年9月8日,小红家着火了（异常对象）

        类是：模板。
        对象是：实际存在的个体。

        钱包丢了（异常类）：
            2008年1月8日，小明的钱包丢了（异常对象）
            2008年1月9日，小芳的钱包丢了（异常对象）
            ....
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        NumberFormatException nfe = new NumberFormatException("数字格式话异常");
        System.out.println(nfe);

        NullPointerException npe = new NullPointerException("空指针异常执行了");
        System.out.println(npe);
    }
}
