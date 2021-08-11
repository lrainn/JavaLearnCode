package com.ame.inter2;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 20; //报错：接口中的成员变量默认被final修饰
        System.out.println(i.num);
//        i.num2 = 20;//报错
        System.out.println(i.num2);
        System.out.println(Inter.num); //接口中的成员变量默认被static修饰
    }
}
