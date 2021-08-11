package com.ame.ex1;

public class BasketballAthlete extends Athlete{
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("BasketbalAthlete eatting....");
    }

    @Override
    public void study() {
        System.out.println("BasketballAthlete studying...");
    }

    @Override
    public String toString() {
        return "BasketballAthlete{}"+super.toString();
    }
}
