package com.ame.inter3;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();
        System.out.println(j);
        //j.eat();//报错


        Animal a = new Cat("加菲",5);
        a.eat();
        System.out.println(a);
        //a.jump();//报错

        Cat c= new Cat("加菲",5);
        System.out.println(c);
        c.eat();
        c.jump();
    }



}
