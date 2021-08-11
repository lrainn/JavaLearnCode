package com.ame.inter2;

public interface Inter {
    public int num = 10;
    int num2 = 20;//等价于 public static final  int num2 = 20;

//    public Inter(){} //接口中没有构造方法
//    public void show(){} //接口中不能有非抽象方法
    public  abstract void method();//接口中只能有抽象的成员方法

}
