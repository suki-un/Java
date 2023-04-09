public class interfate {
    public static void main(String[] args){
        cat c = new cat();
        Dog d = new Dog();
        c.doSome();
        d.doSome();
        c.add(1,2);
        d.add(1, 2);
        d.eat();
        System.out.println(C.i2);
    }
}

interface A{
    void doSome();
    void add(int a ,int b);
}

interface B extends A{
    void doSome();
    void add(int a, int b);
    void eat();
}
interface C{
    //常量(可以省略public static final)
    //public static final int i1 = 1;
    int i2 = 2;
}

class cat implements A {
    public void doSome(){
        System.out.println("doSome");
    }
    public void add(int a ,int b){
        System.out.println("add");
    }
}
class Dog implements B {
    public void doSome() {
        System.out.println("doSome");
    }
    public void add (int a ,int b){
        System.out.println("add");
    }
    public void eat(){
        System.out.println("eat");
    }
}