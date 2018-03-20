package com.example.thread.callable;
interface Test{
	void sayHi();
}

public class MethodRefrenceFunctionalInterface{
	public void sayHello(){
		System.out.println("From sayHello");
	}
	
	public void printHello(){
		System.out.println("From print Helloo");
	}
	
	public static void main(String[] args) {
		System.out.println("In main");
		
		MethodRefrenceFunctionalInterface mref=new MethodRefrenceFunctionalInterface();
	
		Test t1=mref::sayHello;
		Test t2=mref::printHello;
		t1.sayHi();
		t2.sayHi();
	}
}
