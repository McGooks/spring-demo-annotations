package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class JavelinCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Throw 20 javelins";
    }
}
