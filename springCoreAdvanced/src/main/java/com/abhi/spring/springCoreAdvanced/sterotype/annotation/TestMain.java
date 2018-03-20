package com.abhi.spring.springCoreAdvanced.sterotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/abhi/spring/springCoreAdvanced/sterotype/annotation/annotation.xml");

		Professor professor = (Professor) applicationContext.getBean("prof");
		System.out.println(professor);
	}
}
