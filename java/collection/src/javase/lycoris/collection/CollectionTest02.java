package javase.lycoris.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
集合遍历/迭代专题
* */
public class CollectionTest02 {
    public static void main(String[] args) {
        //以下的迭代方式是所有Collaboration通用的
        //在Map中不能使用
        Collection c = new ArrayList();
        //添加元素
        c.add("abc");
        c.add("def");
        c.add("llll");
        c.add(new Object());

        //遍历、迭代
        Iterator it = c.iterator();
        //通过以上获取的迭代器进行迭代/遍历
        /*
            以下两个方法是迭代器对象iterator中的方法
                boolean hasNext() 如果迭代具有更多元素，则返回 true 。
                Object next() 返回迭代中的下一个元素。
        * */
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
            //System.out.println(it.next());
        }

    }
}
