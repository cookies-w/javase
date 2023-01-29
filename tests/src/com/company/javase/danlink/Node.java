package com.company.javase.danlink;

public class Node   {
    // 存储的数据
    Object data;

    // 下一个节点的内存地址
    Node next;

    public Node(){

    }
    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }

}
