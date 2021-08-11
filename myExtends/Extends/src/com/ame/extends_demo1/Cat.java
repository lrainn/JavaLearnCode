package com.ame.extends_demo1;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void CatchMouse(){
        System.out.println("Cat catch a mouse.");
    }

    @Override
    public String toString(){

        return super.toString()+"Class Cat";
    }
}
