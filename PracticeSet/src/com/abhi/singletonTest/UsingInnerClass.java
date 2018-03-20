package com.abhi.singletonTest;

public class UsingInnerClass {
	private UsingInnerClass(){}
	
	private static class UsingInnerClassHelper{
		private static final UsingInnerClass Instance=new UsingInnerClass();
	}
	
	public static UsingInnerClass getInstance(){
		return UsingInnerClassHelper.Instance;
	}
}
