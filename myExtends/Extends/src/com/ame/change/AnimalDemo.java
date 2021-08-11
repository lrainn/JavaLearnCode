package com.ame.change;

public class AnimalDemo {
    public static void main(String[] args) {
        //多态
        Animal a = new Cat();//向上转型：子到超
        a.eat(); //cat eatting...
        //a.playGame();//报错

/*        //创建Cat类对象
        Cat c = new Cat();
        c.eat();//cat eatting...
        c.playGame();//cat palyGame...*/

        //向下转型
        Cat c = (Cat)a; //向下转型：超类对象赋给子类变量
        c.eat();
        c.playGame();
    }
}
