package com.ame.polymorphic;

public class Dog extends  Animal{
    @Override
    public void eat() {
        System.out.println("Dog eatting....");
    }

    public void lookDog(){
        System.out.println("Dog looking...");
    }
}
