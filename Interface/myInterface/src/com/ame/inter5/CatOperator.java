package com.ame.inter5;
//猫的操作类
public class CatOperator {
    public void useCat(Cat c){ //类作为形参
        c.eat();
    }

    public Cat getCat(){ //类名作为返回值
        Cat c = new Cat();
        return c;
    }
}
