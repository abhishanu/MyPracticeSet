package com.example.thread.callable;

public class LamdaExpressionThreadExample {
	static Runnable r1=()->System.out.println("Thread1");
	
	
	public static void main(String []args){
		System.out.println("In main");
		
		Runnable r2=()->System.out.println("Thread2");
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		try {
			Thread.sleep(5000l);
			t1.start();
			t2.start();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		
		System.out.println("End...");
		
	}

}
