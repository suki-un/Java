package www.lycoris.String;

public class StringTest01 {
    public static void main(String[] args) {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes);
        String str2 = new String(bytes,1,2);
        System.out.println(str2);
        System.out.println(str);

        char[] chars ={'我','是','中','国','人'};
        String st = new String(chars);
        System.out.println(st);


        String sss = new String("hello world");
        System.out.println(sss);
    }
}
