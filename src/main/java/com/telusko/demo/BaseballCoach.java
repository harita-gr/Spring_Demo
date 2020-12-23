package com.telusko.demo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		
	}
	public String getDailyWorkout() {
		return "Spend 30min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
