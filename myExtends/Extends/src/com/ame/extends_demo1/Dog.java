package com.ame.extends_demo1;

import com.ame.extends_demo1.Animal;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void WatchDoor(){
        System.out.println("Dog watch doors.");
    }

    public String toString(){
        return super.toString()+"Class Dog";
    }
}
