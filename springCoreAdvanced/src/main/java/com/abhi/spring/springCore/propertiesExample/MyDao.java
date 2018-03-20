package com.abhi.spring.springCore.propertiesExample;

public class MyDao {
	private String user;

	public MyDao(String user) {
		super();
		this.user = user;
	}

	@Override
	public String toString() {
		return String.format("MyDao [user=%s]", user);
	}

}
