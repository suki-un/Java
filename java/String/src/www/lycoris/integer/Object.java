package www.lycoris.integer;

public class Object {
    public static void main(String[] args) {
        //String-->int
        int i = 100;
        String str = String.valueOf(i);
        System.out.println(str+1);//101
        //int-->String
        String str2 = i + "";
        System.out.println(str2+1);//1001
        //int-->Integer
        Integer i1 = i;
        System.out.println(i1);
        //Integer-->int
        int i2 = i1;
        System.out.println(i2);
        Integer.valueOf(i1);
        //String-->Integer
        Integer.valueOf(str);
        //Integer-->String
        String.valueOf(i2);
    }
}
