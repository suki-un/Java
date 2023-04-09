package com.java.lycoris.exception;

class MyStack {
    Object[] elements;
    int index = -1; //表示index指向顶部元素

    public MyStack() {
        this.elements = new Object[10];
    }
    /*
        push压栈方法
     */
    public void push(Object obj) throws MyStackOperationException {
        if (this.index >= this.elements.length-1){
            /*System.out.println("栈已满，无法压栈");
            return;*/
            //创建一个异常对象
            /*MyStackOperationException e = new MyStackOperationException("栈已满，无法压栈");
            //手动给异常抛出去
            throw e;*/
            //合并（手动抛出异常）
            throw new MyStackOperationException("栈已满，无法压栈");
        }
        this.index++;
        this.elements[index] = obj;
        System.out.println("压栈" + obj + "成功，栈帧指向->" + index);
    }

    //pop弹栈方法,需要返回值
    public Object pop() throws MyStackOperationException {
        if(this.index <= -1){
            /*System.out.println("栈已空，无法弹栈");
            return 0;*/
           throw new MyStackOperationException("栈已空，无法弹栈");
        }
        Object t = elements[index--];
        System.out.println("弹栈" + t + "成功，栈帧指向->" + index);
        return t;
    }
}
