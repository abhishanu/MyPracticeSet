package com.abhi.spring.springCoreAdvanced.standAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/abhi/spring/springCoreAdvanced/standAloneCollection/collection.xml");

		ProductsList productsList = (ProductsList) applicationContext.getBean("productsList");

		System.out.println(productsList);

	}

}
