package com.example.thread.callable;

@FunctionalInterface
interface Message{
	public static void myHello(){
		System.out.println("Static method");
	}
	
	void message(String msg);
}

class MessageHello{
	public MessageHello(){
		System.out.println("message Hello");
	}
	
	public MessageHello(String msg){
		System.out.println("message Hello:"+msg);
	}
}

class MessageHi{
	public MessageHi(){
		System.out.println("message Hi");
	}
	
	public MessageHi(String msg){
		System.out.println("message Hello:"+msg);
	}
}
public class ConstructorRefrence {

	public static void main(String[] args) {
		Message msg=MessageHello::new;
		
		msg.message("Hello");
		
		Message msg2=MessageHi::new;
		
		msg2.message("Hi");

	}

}
