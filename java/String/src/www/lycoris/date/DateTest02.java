package www.lycoris.date;
/*
获取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数。
1秒 = 1000毫秒

简单总结一下System类的相关属性和方法：
    System.out 【out是System类的静态变量。】
    System.out.println() 【println()方法不是System类的，是PrintStream类的方法。】
    System.gc() 建议启动垃圾回收器
    System.currentTimeMillis() 获取自1970年1月1日到系统当前时间的总毫秒数。
    System.exit(0) 退出JVM。
* */
public class DateTest02 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(start);

        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗时时长"+(end-begin)+"毫秒");
    }
    public static void print() {
        for (int i = 0; i < 10000; i++ ) {
            //System.out.println("i="+i);
        }
    }
}
