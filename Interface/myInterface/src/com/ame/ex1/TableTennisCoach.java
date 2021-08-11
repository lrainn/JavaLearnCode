package com.ame.ex1;
//具体类
public class TableTennisCoach extends Coach implements SpeakEn{
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("TT Coeach eatting...");
    }

    @Override
    public void teach() {
        System.out.println("TT Coach teaching...");
    }

    @Override
    public void speakEn() {
        System.out.println("TT Coach speaking En....");
    }

    @Override
    public String toString() {
        return "TableTennisCoach{}"+super.toString();
    }
}
