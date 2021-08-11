package com.ame.inter3;

public class Dog extends Animal implements Jumpping{

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
    public void jump() {
        System.out.println("Dog jumpping...");
    }

    @Override
    public String toString() {
        return super.toString()+"Dog{}";
    }
}
