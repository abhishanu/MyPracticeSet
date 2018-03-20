package com.example.thread.callable;

interface doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
} 

@FunctionalInterface  
interface sayable extends doable{  
    void say(String msg);   // abstract method  
}

public class DefaultExample implements sayable {

	public void say(String msg){  
        System.out.println(msg);  
    }
	
	//For test
	/*public void doIt(){
		System.out.println("implemented method");
	}*/
	
	public static void main(String[] args) {
		DefaultExample de=new DefaultExample();
		de.say("Hello");
		de.doIt();
	}

}
