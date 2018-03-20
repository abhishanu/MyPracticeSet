package com.abhi.singletonTest;

public class SingletonClass {
	private static SingletonClass singletonClass=new SingletonClass();
	
	private SingletonClass(){}
	
	private SingletonClass(String name){
		System.out.println("Parametric");
	}
	
	public static SingletonClass getInstance(){
		return singletonClass;
	}
	
	protected static void demoMethod(){
		System.out.println("........Static method in SingletonClass.......");
	}

}
