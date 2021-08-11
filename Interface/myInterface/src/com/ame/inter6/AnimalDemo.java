package com.ame.inter6;
//测试类
public class AnimalDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        AnimalOperator ao = new AnimalOperator();
        //Animal a = new Animal(); //抽象类不能直接实例化，通过创建子类传递
        Animal a = new Cat();
        ao.useAnimal(a);

        Animal a2 = ao.getAnimal();
        a2.eat();
    }
}
