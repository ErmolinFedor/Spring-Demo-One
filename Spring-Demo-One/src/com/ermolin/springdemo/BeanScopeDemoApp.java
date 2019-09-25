package com.ermolin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load configuration file
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		
		//retrieve bean from the spring container
		
		Coach theCoach= context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach= context.getBean("myCoach", Coach.class);
		
		//chek if they are the same
		
		boolean result= theCoach==alphaCoach;
		System.out.println("\nThe is a same object:"+result);
		System.out.println("\nMemory location for the theCoach: "+theCoach);
		System.out.println("\nMemory location for the alphaCoach: "+alphaCoach+"\n");
		
		context.close();
		
	}

}
