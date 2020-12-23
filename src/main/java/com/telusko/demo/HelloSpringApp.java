package com.telusko.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load Spring  config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrive bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//call methods on bean 
		
		System.out.println(theCoach.getDailyWorkout());
		//let's call the new method for fortune service
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();

}
	
}