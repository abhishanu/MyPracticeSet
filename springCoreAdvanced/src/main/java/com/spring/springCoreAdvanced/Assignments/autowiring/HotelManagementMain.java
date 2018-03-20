package com.spring.springCoreAdvanced.Assignments.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HotelManagementMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/spring/springCoreAdvanced/Assignments/autowiring/hotelManagement.xml");

		Customer customer = (Customer) applicationContext.getBean("customer");

		System.out.println(customer);

	}

}
