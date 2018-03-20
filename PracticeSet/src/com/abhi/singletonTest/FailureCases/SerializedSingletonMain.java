package com.abhi.singletonTest.FailureCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedSingletonMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		SerializedSingleton instanceOne=SerializedSingleton.getInstance();
		ObjectOutput out=new ObjectOutputStream(new FileOutputStream("abhi.ser"));
		
		out.writeObject(instanceOne);
		out.close();
		
		//deserailize from file output
		ObjectInput in =new ObjectInputStream(new FileInputStream("abhi.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();
		
		System.out.println("Instance One::"+instanceOne);
		System.out.println("Instance Two::"+instanceTwo);
	}
	

}
