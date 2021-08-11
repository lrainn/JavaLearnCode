package com.ame.MyAbstract.ex1;
//抽象类继承抽象超类：不同重写
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog eatting...");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}