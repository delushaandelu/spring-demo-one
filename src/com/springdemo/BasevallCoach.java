package com.springdemo;

public class BasevallCoach implements Coach {
	
	//define a private field for the dependancy
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BasevallCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do 30 min workout per day";
	}
	
	@Override
	public String getDailyMealShedule() {
		// TODO Auto-generated method stub
		return "Eat egg and drink milk";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
