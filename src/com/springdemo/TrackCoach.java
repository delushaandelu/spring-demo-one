package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TRACKCOACH: inside method doMyStartupStuff");
	}
	
	//add a destory method
	public void doMyCleaupStuff() {
		System.out.println("TRACKCOACH: inside method doMyCleaupStuff");
	}
	
	
	public TrackCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5K";
	}

	@Override
	public String getDailyMealShedule() {
		// TODO Auto-generated method stub
		return "Drink much water";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it : " + fortuneService.getFortune();
	}

}
