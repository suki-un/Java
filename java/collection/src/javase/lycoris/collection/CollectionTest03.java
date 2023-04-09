package javase.lycoris.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        //创建集合对象
        Collection ct = new ArrayList();
        //存入元素
        ct.add(1);
        ct.add(2);
        ct.add(3);
        ct.add(2);
        ct.add(3);
        ct.add(1);
        //获取迭代器
        Iterator it = ct.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //new一个HashSet集合
        //HashSet集合：无序不可重复
        //无序：存进去和取出的不一定顺序相同
        //不可重复存储相同的
        Collection ct2 = new HashSet();
        //存入元素
        ct2.add(122);
        ct2.add(123);
        ct2.add(122);
        ct2.add(25);
        ct2.add(123);
        Iterator it2 = ct2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
