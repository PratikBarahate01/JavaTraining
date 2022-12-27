package com.ust.annotationConfiguration.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.annotationConfiguration.springAnnotation.quoteService.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

//		read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from the spring container
		Teacher chem = context.getBean("chemistryTeacher", Teacher.class);

		// call method
		System.out.println(chem.getDailyHomework());

		// call method to get the daily quote
		//System.out.println(chem.getDailyHomework());

		// close context
		context.close();
	}
}
