package com.ame.ex1;
//测试类
public class ImplExtendsDemo {
    public static void main(String[] args) {
        //创建乒乓球教练对象
        TableTennisCoach ttc = new TableTennisCoach();
        ttc.setAge(34);
        ttc.setName("PINGPANG");
        ttc.eat();
        ttc.teach();
        ttc.speakEn();
        System.out.println(ttc.toString());

        //创建篮球运动员对象
        BasketballAthlete ba = new BasketballAthlete("ba",45);
        ba.eat();
        ba.study();
        System.out.println(ba.toString());



    }
}
