package com.ame.polymorphic.case1;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a);
        a.eat();

//        a = new Cat("加菲",5);
//        System.out.println(a);
//        a.eat();


        //向下转型
        Cat c = (Cat) a;
        c.eat();

//        Dog d = (Dog) a;
//        d.eat();
    }
}
