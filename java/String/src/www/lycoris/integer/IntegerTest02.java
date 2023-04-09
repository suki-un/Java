package www.lycoris.integer;
/*
byte      Byte
short     Short
long      Long
float     Float
double    Double
boolean   Boolean
char      Character
int       Integer
* */
public class IntegerTest02 {
    public static void main(String[] args) {
        //基本数据类型-->应用数据类型（装箱）
        Integer i1 = new Integer(100);
        //应用数据类型-->基本数据类型（拆箱）
        double d = i1.doubleValue();
        System.out.println(d);


    }
}
