package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeenScopeDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrive bean from srpong container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Check if they are the same been
		
		boolean result = (theCoach == alphaCoach);
		
		//print the reut
		System.out.println("\nPointing to the same objet :" + result);
		
		System.out.println("\nMemory location for the theCoach :" + theCoach);
		System.out.println("\nMemory location for the alphaCoach :" + alphaCoach + "\n");
		
		context.close();
	}

}
