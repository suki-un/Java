package www.lycoris.stringbuffer;

/*
* 如果以后开发要进行多次字符串的拼接建议使用jdk自带的：
* java.long.StringBuffer
* java.long.StringBuilder*/
public class StringBufferTest02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");
        sb.append("yyy");
        sb.append(10);
        System.out.println(sb);
    }
}
