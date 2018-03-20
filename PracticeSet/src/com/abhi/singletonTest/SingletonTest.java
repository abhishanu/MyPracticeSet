package com.abhi.singletonTest;

public class SingletonTest {
	public static void main(String[] args) {
		System.out.println("Singleton test thread:"+Thread.currentThread().getName());
		
		System.out.println();
		System.out.println("***********Using Normal approach creating Singleton***********");
		SingletonClass singletonClass=SingletonClass.getInstance();
		System.out.println("_______Instance_______::"+singletonClass);
		//singletonClass.demoMethod();
		SingletonClass singletonClass1=SingletonClass.getInstance();
		System.out.println("_______Instance_______::"+singletonClass1);
		
		System.out.println();
		System.out.println("***********Using Inner Class creating Singleton***********");
		UsingInnerClass innerClass=UsingInnerClass.getInstance();
		System.out.println("_______Instance_______::"+innerClass);
		
		UsingInnerClass innerClassTwo=UsingInnerClass.getInstance();
		System.out.println("_______Instance_______::"+innerClassTwo);
		
		
		System.out.println();
		System.out.println("***********Creating SIngleton ThreadSafe***********");
		SIngletonClassUsingThreadSafe singletonClassUsingThreadSafe=SIngletonClassUsingThreadSafe.getInstance();
		System.out.println("_______Instance_______::"+singletonClassUsingThreadSafe);
		
	}
}
