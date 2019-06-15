package com.springdemo;

public class SwimingCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public SwimingCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyMealShedule() {
		// TODO Auto-generated method stub
		return "Swim 3 hours per day";
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Dont Smoke";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
