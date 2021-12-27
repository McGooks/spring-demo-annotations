package com.luv2code.springdemo;

public class SwimCoach implements Coach {

    FortuneService fortuneService;

    public SwimCoach() {
        System.out.println("SwimCoach: default contructor");
    }

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDetails() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
