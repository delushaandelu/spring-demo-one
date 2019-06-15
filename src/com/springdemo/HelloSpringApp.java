package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Loading the configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyMealShedule());
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call our new method for fotunre
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
