package com.company.javase.danlink;

public class Link {
    public static void main(String[] args) {
        //创建了一个集合对象
        Link link = new Link();
        link.add(100);
        link.add(200);
        link.add(300);
        System.out.println(link.size());
    }

    // 头节点
    Node header;

    int size = 0;

    public int size(){
        return size;
    }

    // 向链表中添加元素的方法（向末尾添加）
    public void add(Object data){
        if(header == null){
            // 说明还没有节点。
            // new 一个新的节点对象，作为头节点对象。
            // 这个时候的头节点既是一个头节点，又是一个末尾节点。
            header = new Node(data, null);
        }else {
            // 说明头不是空！
            // 头节点已经存在了！
            // 找出当前末尾节点，让当前末尾节点的 next 是新节点。
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data, null);
        }
        size++;
    }
    /**
     * 专门查找末尾节点的方法。
     */
    private Node findLast(Node node) {
        if(node.next == null) {
            // 如果一个节点的 next 是 null
            // 说明这个节点就是末尾节点。
            return node;
        }
        // 程序能够到这里说明：node 不是末尾节点。
        return findLast(node.next); // 递归算法！
    }
    // 删除链表中某个数据的方法
    public void remove(Object obj){
    }

    // 修改链表中某个数据的方法
    public void modify(Object newObj){
    }
    // 查找链表中某个元素的方法。
    public int find(Object obj){
        return 1;
    }


}
