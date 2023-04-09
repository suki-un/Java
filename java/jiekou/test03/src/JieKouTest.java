public class JieKouTest {
    public static void main(String[] args){
        Flying A = new Cat();
        A.fly();
        Eat e = new Dog();
        e.eat();
        Flying f = new Dog();
        f.fly();

    }
}

class Animal{

}
interface Flying{
    void fly();
}
interface  Eat{
    void eat();
}
class Cat extends Animal implements Flying {
    public void fly() {
        System.out.println("猫飞....");
    }
}
class Dog extends Animal implements Flying,Eat {
    public void fly() {
        System.out.println("狗飞......");

    }
    public void eat(){
        System.out.println("狗吃.......");
    }

}
