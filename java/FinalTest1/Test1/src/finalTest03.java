public class finalTest03 {
    /*
    final修饰的变量“引用”
    引用也是变量
    * */
    public static void main(String[] args) {
        Person p = new Person(20);
        System.out.println(p.age);

        System.out.println("-----------------");
        final Person p1 = new Person(20);

        /*
        final修饰的引用也只能赋值一次
        * */

        /*p1 = new Person(30);*/
        System.out.println(p1.age);
    }
}

class Person {
    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }
}

