package com.ame.inter1;
/*
    类与接口间的关系:implements(实现)
* */
public class Cat implements Jumpping{
    @Override
    public void jump() {
        System.out.println("Cat jumpping...");
    }
}
