package com.ame.ex1;
//抽象运动员类
public abstract class Athlete extends Human{
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void study();

    @Override
    public String toString() {
        return "Athlete{}"+super.toString();
    }
}
