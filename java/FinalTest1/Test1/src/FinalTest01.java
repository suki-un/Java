public class FinalTest1 {
    public static void main(String[] args) {
        //final修饰的方法也无法被继承
        A2 a2 = new A2();
        a2.a();

    }
}

class A1 {
    public final void a(){
        System.out.println("123");
    }

    public A1() {
    }
}
class A2 extends A1 {
    //final修饰的关键字无法被覆盖
    /*public void a() {
        System.out.println("123");
    }*/
}
