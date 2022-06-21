package com.learn.spring;

public class HappyFortuneservice implements Fortuneservice{

    @Override
    public String getDailyFortune() {
        return "Today is your lucky day!!!";
    }
}
