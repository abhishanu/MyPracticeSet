package com.example.thread.callable;

public class MethodRefrence {
	
	public static void threadStatus(){
		System.out.println("Thread is running...");
	}
	
	public void sayHello(){
		System.out.println("Non-static method...");
	}

	public static void main(String[] args) {
		System.out.println("In main");
		MethodRefrence mref=new MethodRefrence();
		//method reference
		Thread t1=new Thread(MethodRefrence::threadStatus);
		t1.start();
		
	
		Thread t2=new Thread(mref::sayHello);
		t2.start();
	}

}
