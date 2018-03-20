package com.abhi.spring.springCoreAdvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private Address address;
	
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("Employee [address=%s]", address);
	}

}
