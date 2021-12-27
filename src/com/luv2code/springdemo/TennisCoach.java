package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Qualifier("fileFortuneService")
    @Autowired
    private FortuneService fortuneService;
    //    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
//    //define a setter
//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println("TennisCoach: Inside doSomeCrazyStuff() method");
//        this.fortuneService = fortuneService;
//    }
//
//    //define a setter
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("TennisCoach: Inside setFortuneService() method");
//        this.fortuneService = fortuneService;
//    }
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    //define a default constructor
    public TennisCoach() {
        System.out.println("TennisCoach: Inside default constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
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
