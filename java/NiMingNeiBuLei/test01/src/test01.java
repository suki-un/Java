/*
匿名内部类
* */
public class test01 {
    //该类属于类的内部，叫内部类，有static修饰叫“静态内部类”
    static class inner1{

    }
    //没有被static修饰，叫做“实例内部类”
    class inner2 {

    }
    public void dosome(){
        //局部内部类
        class inner3{

        }
        class inner2{

        }
    }

    public static void main(String[] args) {
        MyMath mm = new MyMath();
        //mm.MySum(new Compterimp(),100,98);
        mm.MySum(new Compter() {
            @Override
            public int sum(int a, int b) {
                return 0;
            }
        },100,98);
    }
}
interface Compter {
    int sum(int a,int b);
}
/*class Compterimp implements Compter{
    public int sum(int a, int b) {
        return a+b;
    }
}*/
class MyMath {
    public void MySum(Compter c,int a,int b){
        int retVal = c.sum(a, b);
        System.out.println(a + "+" + b + "=" + retVal);
    }
}
