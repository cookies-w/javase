package com.company.javase.exception;

public class MyStack {
    private Object[] elements;
    private int index;

    public MyStack() {
        // 一维数组动态初始化
        // 默认初始化容量是 10.
        this.elements = new Object[10];
        // 给 index 初始化
        this.index = -1;
    }

    public void push(Object obj) throws MyStackOperationException {
        if(index >= elements.length - 1){
            throw new MyStackOperationException("压栈失败，栈已满！");
        }
        // 程序能够走到这里，说明栈没满
        // 向栈中加 1 个元素，栈帧向上移动一个位置。
        index++;
        elements[index] = obj;
        System.out.println("压栈" + obj + "元素成功，栈帧指向" + index);
    }
    /**
     * 弹栈的方法，从数组中往外取元素。每取出一个元素，栈帧向下移动一位。
     * @return
     */
    public void pop() throws MyStackOperationException {
        if(index < 0){
            throw new MyStackOperationException("弹栈失败，栈已空！");
        }
        // 程序能够执行到此处说明栈没有空。
        System.out.print("弹栈" + elements[index] + "元素成功，");
        // 栈帧向下移动一位。
        index--;
        System.out.println("栈帧指向" + index);
    }

    public Object[] getElements() {
        return elements;
    }
    public void setElements(Object[] elements) {
        this.elements = elements;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}

