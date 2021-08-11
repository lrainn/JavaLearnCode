package com.ame.MyAbstract.ex1;
//非抽象子类继承抽象超类：要重写超类中所有抽象方法
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat eating...");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}
