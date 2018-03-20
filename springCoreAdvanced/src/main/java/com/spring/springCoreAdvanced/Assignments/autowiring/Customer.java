package com.spring.springCoreAdvanced.Assignments.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	private String name;

	@Autowired
	private Reservation reservation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return String.format("Customer [name=%s, reservation=%s]", name, reservation);
	}

}
