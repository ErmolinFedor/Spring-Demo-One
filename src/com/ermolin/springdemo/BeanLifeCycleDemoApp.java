package com.ermolin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load configuration file
		
				ClassPathXmlApplicationContext context=
						new ClassPathXmlApplicationContext(
								"BeanLifeCycle-applicationContext.xml");
				
				//retrieve bean from the spring container
				
				Coach theCoach= context.getBean("myCoach", Coach.class);
				
				System.out.println(theCoach.getDailyWorkout());
				
				context.close();

	}

}
