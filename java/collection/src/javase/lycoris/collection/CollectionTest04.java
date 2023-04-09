package javase.lycoris.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection中的contains方法：
    boolean contains(Object o) 如果此集合包含指定的元素，则返回 true 。
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        //创建集合
        Collection c = new ArrayList();

        //向集合中存储元素
        c.add(new String("aaa"));

        String s = new String("bbb");
        c.add(s);

        String s1 = new String("ccc");
        c.add(s1);

        System.out.println(c.size());//3

        String x = new String("aaa");

        System.out.println(c.contains(x));//contains重写了equals方法，结果为true
    }
}
