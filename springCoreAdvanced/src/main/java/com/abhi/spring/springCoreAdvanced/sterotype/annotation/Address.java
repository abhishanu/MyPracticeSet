package com.abhi.spring.springCoreAdvanced.sterotype.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;

	// if value annotation is applied then the value in @Value("") will be
	// applicable instead of locally assigned
	@Value("UP")
	String state = "MP";

	public String getCity() {
		return city;
	}

	@Value("kanpur")
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return String.format("Address [city=%s, state=%s]", city, state);
	}

}
