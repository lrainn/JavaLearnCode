package com.ame.MyAbstract.ex1;
/*
* 抽象类
* */
public abstract class Animal { //有抽象方法的类必须定义为抽象类
    private String name;
    private int age;

    public Animal(){}
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void eat();
}
