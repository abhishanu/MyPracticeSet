package com.abhi.singletonTest.FailureCases;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
	private static final long versionId=120l;
	
	private SerializedSingleton(){}
	
	private static class SerializedSingletonHelper{
		private static final SerializedSingleton instance=new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance(){
		return SerializedSingletonHelper.instance;
	}
	
	protected Object readResolve(){
		return getInstance();
	}
}
