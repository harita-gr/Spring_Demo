package com.telusko.demo;

public class CricketCoach implements Coach {

	//Helper
	private FortuneService fortuneService;
	//Literals Injection
	private String emailAddress;
	private String team;
	
	//No-args constructor
	public CricketCoach() {
		System.out.println("Inside no args constructor");
	}
	
//	public CricketCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Bowl for 1hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	//Getters

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	//Setter Method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setter method - email");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Inside setter method - team" );
		this.team = team;
	}
	
	
	

}
