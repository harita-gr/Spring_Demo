package com.telusko.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);

		//check if they are same
		
		boolean result = (theCoach == alphaCoach);
		//print result
		System.out.println("Equal: "+result);
		System.out.println("Memory location - coach" +theCoach);
		System.out.println("Memory location - alpha" +alphaCoach);
	}

}
