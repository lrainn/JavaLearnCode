package com.ame.inter1;
/*
* 测试类
* */
public class JumppingDemo {
    public static void main(String[] args) {
        //Jumpping j = new Jumpping(); //报错:接口为抽象的，不能直接实例化
        Jumpping j = new Cat(); //接口的实例化：采用多态的形式，用它的实现类实例化

        j.jump();
    }
}
