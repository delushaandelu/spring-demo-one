package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoAapp {

	public static void main(String[] args) {
		
		//load spring configurate
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//returive bean form spring con
		CricketCoach theCoach = context.getBean("MyCricketCoach", CricketCoach.class);
		
		//call the method
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyMealShedule());
		System.out.println(theCoach.getDailyWorkout());
		
		//Call our new method to get the litral value - setter()
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		
		//cloase the context
		context.close();

	}

}
