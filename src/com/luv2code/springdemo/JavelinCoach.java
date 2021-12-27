package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavelinCoach implements Coach {

    @Qualifier("randomFortuneService")
    @Autowired
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;


    @Override
    public String getDailyWorkout() {
        return "Throw 20 javelins";
    }

    @Override
    public String getDetails() {
        return "Team: " + team + "\nEmail: " + email;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
