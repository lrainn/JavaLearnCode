package com.ame.polymorphic;
/*
* 测试类
* */
public class AnimalDemo {
    public static void main(String[] args) {
/*        //有超类引用指向子类对象
        Animal a = new Cat();

        System.out.println(a.age); //age = 40，访问的是超类变量
        //System.out.println(a.weigtht); 报错

        a.eat(); //调用cat类override后的成员方法
        //a.playGame(); //报错*/
        //创建动物操作类对象，调用方法
/*        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);

        Dog d = new Dog();
        ao.useAnimal(d);*/
        AnimalOperator ao = new AnimalOperator();
        Animal c = new Cat(); //超类引用指向子类对象
        Animal d = new Dog();

        ao.useAnimal(c);
        ao.useAnimal(d);

        //System.out.println(d.lookDog()); //报错：多态形式不能具体访问某个子类特有的功能



    }
}
