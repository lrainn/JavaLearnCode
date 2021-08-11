package com.ame.ex1;
//抽象教练类
public abstract class Coach extends Human{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach(); //抽象方法

    @Override
    public String toString() {
        return "Coach{}"+super.toString();
    }
}
