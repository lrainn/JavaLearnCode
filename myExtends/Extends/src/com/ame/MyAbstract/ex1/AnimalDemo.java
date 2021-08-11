package com.ame.MyAbstract.ex1;

public class AnimalDemo {
    public static void main(String[] args) {
        //抽象类如何创建对象：参见多态
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

    }
}
