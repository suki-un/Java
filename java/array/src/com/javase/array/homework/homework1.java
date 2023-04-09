package com.javase.array.homework;
/*
* 第一题：
    编写程序，使用一维数组，模拟栈数据结构。
    要求：
        1、这个栈可以存储java中的任何引用类型的数据。
        2、在栈中提供push方法模拟压栈。（栈满了，要有提示信息。）
        3、在栈中提供pop方法模拟弹栈。（栈空了，也有有提示信息。）
        4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。

        public class MyStack{ // 栈类

            // 提供一个数组来存储栈中的元素
            Object[] elements;

            // 栈帧（永远指向栈顶部的元素）
            // 每加1个元素，栈帧+1
            // 每减1个元素，栈帧-1
            int index;

            // 构造方法
            // 构造方法是不是应该给一维数组一个初始化容量。

            // push方法（push方法压栈）
            // 压栈表示栈中多一个元素。
            // 但是栈如果已满，压栈失败。
            // 这个方法的参数以及返回值类型自己定义。

            // pop方法（pop方法弹栈）
            // 弹栈表示栈中少一个元素。
            // 但是栈如果已空，弹栈失败。
            // 这个方法的参数以及返回值类型自己定义。

        }

        main(){
            测试...
        }
 */
public class homework1 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(new Object());
        stack.push(new Object());
        stack.pop();
    }
}
class MyStack {
    Object[] elements;
    int index = -1; //表示index指向顶部元素

    public MyStack() {
        this.elements = new Object[10];
    }
    /*
        push压栈方法
     */
    public void push(Object obj){
        if (this.index >= this.elements.length-1){
            System.out.println("栈已满，无法压栈");
            return;
        }
        this.index++;
        this.elements[index] = obj;
        System.out.println("压栈" + obj + "成功，栈帧指向->" + index);
    }

    //pop弹栈方法,需要返回值
    public Object pop(){
        if(this.index <= -1){
            System.out.println("栈已空，无法弹栈");
            return 0;
        }
        Object t = elements[index--];
        System.out.println("弹栈" + t + "成功，栈帧指向->" + index);
        return t;
    }
}
