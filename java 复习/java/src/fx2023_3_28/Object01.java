package fx2023_3_28;

public class Object01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "小明";
        p1.age = 20;
        Person p2 = new Person();
        p2 =p1;//赋值的是内存地址
        p2.name = "小红";
        System.out.println(p2.name + p2.age);
        System.out.println(p1.name + p1.age);
    }
}


class Person {
    String name;
    int age;
}