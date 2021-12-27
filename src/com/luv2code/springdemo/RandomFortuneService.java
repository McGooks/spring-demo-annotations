package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private final String[] data = {
            "Beware of wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "Do not wear brown on a Friday"
    };

    Random rand = new Random();

    @Override
    public String getFortune() {
        int index = rand.nextInt(data.length);
        return data[index];
    }
}
