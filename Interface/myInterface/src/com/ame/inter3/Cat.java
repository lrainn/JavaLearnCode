package com.ame.inter3;

public class Cat extends Animal implements Jumpping{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat eatting...");
    }

    @Override
    public void jump() {
        System.out.println("Cat jumpping...");
    }

    @Override
    public String toString() {
        return "Cat{}"+super.toString();
    }
}
