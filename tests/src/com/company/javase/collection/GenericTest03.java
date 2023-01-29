package com.company.javase.collection;

public class GenericTest03<标识符随便写> {

    public void doSome(标识符随便写 o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        // new 对象的时候指定了泛型是：String 类型
        GenericTest03<String> gt = new GenericTest03<>();

        // 类型不匹配
        //gt.doSome(100)
        gt.doSome("abc");

        // =============================================================
        GenericTest03<Integer> gt2 = new GenericTest03<>();
        gt2.doSome(100);

        // 类型不匹配
        //gt2.doSome("abc");

        // 不用泛型就是 Object 类型。
        GenericTest03 gt3 = new GenericTest03();
        gt3.doSome(new Object());

        MyIterator<String> mi = new MyIterator<>();
        String s1 = mi.get();

        MyIterator<Animal> mi2 = new MyIterator<>();
        Animal a = mi2.get();

    }
}

class MyIterator<T> {
    public T get(){
        return null;
    }
}
