package com.ame.inter7;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.useJumpping(j);//Cat jumpping....

        Jumpping j2 = jo.getJumpping();//Cat jumpping....
        j2.jump();

    }

}
