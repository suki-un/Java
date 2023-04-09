package fx2023_3_28;

public class ObjectMethod {
    public static void main(String[] args) {
        Person2 p = new Person2();
        p.name = "李四";
        p.age = 19;
        p.method(p);
        System.out.println(p.name);
    }
}

class Person2 {
    String name;
    int age;

    void method(Person2 o) {
        o.name = "张三";
        o.age = 20;
    }
}