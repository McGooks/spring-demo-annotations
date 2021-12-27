package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
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

    //define my init  method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("TennisCoach: inside of doMyStartUpStuff");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("TennisCoach: inside of doMyCleanUpStuff" + fortuneService.getFortune());
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
