public class abstractTest {
    public static void main(String[] args) {
        bread b = new bread();
        b.eat();
        dog d = new dog();
        d.eat();
    }
}
abstract class a1{
    public abstract void eat();
}

class bread extends a1 {
    public void eat() {
        System.out.println("鸟吃");
    }
}

class dog extends a1 {
    public void eat() {
        System.out.println("狗吃");
    }
}
