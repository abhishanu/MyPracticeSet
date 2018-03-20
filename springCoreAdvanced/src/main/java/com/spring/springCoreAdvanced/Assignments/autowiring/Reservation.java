package com.spring.springCoreAdvanced.Assignments.autowiring;

public class Reservation {
	private int id;

	private String day;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return String.format("Reservation [id=%s, day=%s]", id, day);
	}

}
