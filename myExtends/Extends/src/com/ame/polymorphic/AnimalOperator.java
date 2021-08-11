package com.ame.polymorphic;

/*
    动物操作类
*/
public class AnimalOperator {
//    public void useAnimal(Cat c){
//        c.eat();
//    }
//
//    public void useAnimal(Dog d){
//        d.eat();
//    }
    //用超类做参数，子类对象进行调用，避免了多次定义方法
    public void useAnimal(Animal a){
        a.eat();
    }
}
