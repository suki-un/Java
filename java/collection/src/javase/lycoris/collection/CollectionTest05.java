package javase.lycoris.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
测试contains
 */
public class CollectionTest05 {
    public static void main(String[] args) {
        //创建集合对象
        Collection co = new ArrayList();
        User u = new User("jack");
        co.add(u);
        User u2 = new User("jack");
        System.out.println(co.contains(u2));//false因为没有重写equals方法

        Collection co2 = new ArrayList();
        co2.add("jack");
        String s = new String("jack");
        co2.remove(s);//remove方法也重写equals
        System.out.println(co2.size());
    }
}
class User{
    String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }
}