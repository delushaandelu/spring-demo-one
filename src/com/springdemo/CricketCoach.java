package com.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//add new fields
	private String emailAddress;
	private String team;
	
	
	//create no-arg cons
	
	public CricketCoach() {
		System.out.println("CricketCoash: Inside no-arg Constructor");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoash: Inside setter methods- setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoash: Inside setter methods- setTeam");
		this.team = team;
	}
	
	//out setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoash: Inside setter methods- setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		System.out.println("CricketCoash: getDailyWorkout()");
		return "Daily crocket fast balling 50 min a day";
	}

	@Override
	public String getDailyMealShedule() {
		return "Eat well for cricket";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
