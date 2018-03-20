package com.abhi.singletonTest.FailureCases;

import java.lang.reflect.Constructor;

import com.abhi.singletonTest.SingletonClass;

public class BreakSingletonWithReflection {

	public static void main(String[] args) {
		
		SingletonClass instanceOne = SingletonClass.getInstance();
		
		SingletonClass instanceTwo = null;
		
		try {
			Constructor[] constructors = SingletonClass.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				//Code To destroy SingletonPatterns
				
				constructor.setAccessible(true);
				instanceTwo = (SingletonClass) constructor.newInstance();
				break;
			}
			
		} catch (Exception e) {
			System.out.println("Exception Occured");
		}
		
		System.out.println("Instance One::"+instanceOne);
		System.out.println();
		System.out.println("Instance::"+instanceTwo);

	}

}
