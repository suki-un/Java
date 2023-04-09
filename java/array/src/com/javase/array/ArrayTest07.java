package com.javase.array;

public class ArrayTest07 {
    public static void main(String[] args) {
        Animal[] animals = {new Animal(),new Animal(),new Animal()};
        //遍历animal数组
        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i];
            a.move();
            //合并上面两行代码
            animals[i].move();
        }
        Animal[] ans = new Animal[2];
        ans[0] = new Animal();
        ans[1] = new Cat();
        System.out.println("____________________________");
        Animal[] anis = {new Cat(), new Dog()};
        //遍历
        for (int i = 0; i < anis.length; i++) {
            /*Animal a = anis[i];
            a.move();*/
            //合并
            anis[i].move();
            //调用Animal子类的特有方法，判断是Cat还是Dog
            if(anis[i] instanceof Cat){
                //强制向下转型
                ((Cat) anis[i]).run();
            }else {
                //强制向下转型
                ((Dog) anis[i]).eat();
            }
        }

    }
}

class Animal{
    public void move() {
        System.out.println("Animal move......");
    }
}

class Cat extends Animal {
    public void move() {
        System.out.println("Cat move...");
    }
    public void run() {
        System.out.println("Cat run");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dog move....");
    }
    public void eat() {
        System.out.println("Dog eat");
    }
}
