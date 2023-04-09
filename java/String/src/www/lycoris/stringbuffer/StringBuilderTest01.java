package www.lycoris.stringbuffer;

/*
StringBuilderTest01
StringBuilder和StringBuffer的区别
StringBuffer里的方法都有synchronized关键字修饰，表示StringBuffer在多线程的环境下是安全的
StringBuilder里的方法都没有synchronized关键字修饰，表示StringBuilder在多线程的环境下是不安全的
 */
public class StringBuilderTest01 {
    public static void main(String[] args) {
        //使用StringBuilder也能完成字符串的拼接
        StringBuilder sb = new StringBuilder();
        sb.append("aaaa");
        sb.append("bbb");
        System.out.println(sb);
    }
}
