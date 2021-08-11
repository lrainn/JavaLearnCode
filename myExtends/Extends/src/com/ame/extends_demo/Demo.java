package com.ame.extends_demo;

import com.ame.extends_demo1.Animal;
import com.ame.extends_demo1.Cat;
import com.ame.extends_demo1.Dog;

public class Demo {
    public static void main(String[] args) {
/*        SubClass sub = new SubClass();
        System.out.println(sub.age);

        System.out.println();*/
        Animal aAnimal = new Animal("animal",10);
        Cat aCat = new Cat("neko",12);
        Dog aDog = new Dog("dog",11);


        System.out.println(aAnimal.toString());
        System.out.println(aCat.toString());
        System.out.println(aDog.toString());

    }
}
