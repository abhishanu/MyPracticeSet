package com.abhi.singletonTest;

public class SIngletonClassUsingThreadSafe {
	private static SIngletonClassUsingThreadSafe singletonClassUsingThreadSafe;
	private SIngletonClassUsingThreadSafe(){}
	
	public static SIngletonClassUsingThreadSafe getInstance(){
		if(singletonClassUsingThreadSafe==null){
			synchronized (SIngletonClassUsingThreadSafe.class) {
				singletonClassUsingThreadSafe=new SIngletonClassUsingThreadSafe();
			}
		}
		return singletonClassUsingThreadSafe;
	}
}
