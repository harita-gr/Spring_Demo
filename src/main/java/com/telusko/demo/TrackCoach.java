package com.telusko.demo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it!";
	}

	
	//add init method
	public void doMyStartUpStuff() {
		
		System.out.println("INIT METHOD...Do my startup stuffs");
	}
	
	//add destroy method
	
	public void doMyCleanUpStuff() {
		
		System.out.println("DESTROY METHOD...Do my cleanup stuffs");
	}
}
