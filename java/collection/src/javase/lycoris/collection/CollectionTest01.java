package javase.lycoris.collection;
/*
.add();是加
.clean();是清空
.contains();是判断是否含有这个数组
.remove();删除集合中的某个元素
.isEmpty();判断集合中的元素个数是否为0
Object[] toArray() 调用这个方法可以把集合转化为数组
* */
import java.util.ArrayList;
import java.util.Collection;

/*
boolean add(E e)
确保此集合包含指定的元素（可选操作）。
* */
public class CollectionTest01 {
    public static void main(String[] args) {
        // 创建一个集合对象
        //Collection c = new Collection(); // 接口是抽象的，无法实例化。
        // 多态
        Collection c = new ArrayList();
        // 测试Collection接口中的常用方法
        c.add(1200); // 自动装箱(java5的新特性。),实际上是放进去了一个对象的内存地址。Integer x = new Integer(1200);
        c.add(3.14); // 自动装箱
        c.add(new Object());
        c.add(new Student());
        c.add(true); // 自动装箱

        // 获取集合中元素的个数
        System.out.println("集合中元素个数是：" + c.size()); // 5

        //清空集合
        c.clear();
        System.out.println("集合中元素个数是：" + c.size());//0
        //再想集合中添加元素
        c.add("ceshi");
        c.add("test");
        c.add("cece");
        c.add(1);

        //集合中是否包含“cece”
        boolean b = c.contains("cece");
        System.out.println(b?"包含":"不包含");//包含
        System.out.println(c.contains(1)?"包含":"不包含");
        System.out.println(c.contains(1200)?"包含":"不包含");

        //删除集合中的某个元素
        System.out.println(c.size());//4
        c.remove(1);
        System.out.println(c.size());//3

        //判断集合中的元素个数是否为0
        c.clear();//这是已经为空了
        boolean size =c.isEmpty();
        System.out.println(size ? "空":"不空");

        c.add("abc");
        c.add("def");
        c.add("100");
        Object[] o = c.toArray();
        //遍历
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i]);
        }
    }
}
class Student {

}

