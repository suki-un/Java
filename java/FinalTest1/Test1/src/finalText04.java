
/*
 * Copyright (c) lycoris
 */

public class finalText04 {
    //final修饰的实例变量也是一样，必须手动赋值一次
    public static void main(String[] args) {
        User user = new User("kkk");
    }
}

class User{
    final String name;

    public User(String name) {
        this.name = name;
    }
}
