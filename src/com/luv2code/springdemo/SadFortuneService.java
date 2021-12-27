package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService{

    FortuneService fortuneService;

    @Override
    public String getFortune() {
        return "Today is a sad day";
    }
}
