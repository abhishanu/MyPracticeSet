package com.abhi.spring.springCore.propertiesExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/abhi/spring/springCore/propertiesExample/dbConfig.xml");

		MyDao mydao = (MyDao) applicationContext.getBean("mydao");

		System.out.println("User Name::" + mydao);

	}

}
