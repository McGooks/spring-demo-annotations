package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class JavelinCoach implements Coach {

    FortuneService fortuneService;

//    @Autowired
//    public JavelinCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Throw 20 javelins";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
