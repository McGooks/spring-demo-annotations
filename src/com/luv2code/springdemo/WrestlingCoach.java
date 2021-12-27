package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class WrestlingCoach implements Coach {

	FortuneService fortuneService;

	public WrestlingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your double leg takedown.";
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
