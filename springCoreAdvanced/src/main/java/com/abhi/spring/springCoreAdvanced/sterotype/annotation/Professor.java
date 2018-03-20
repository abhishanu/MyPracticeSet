package com.abhi.spring.springCoreAdvanced.sterotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("prof")
public class Professor {
	@Value("#{10+20}")
	int id;

	@Value("${profName}")
	String name;

	@Autowired
	private Address address;

	@Value("#{subj}")
	private List<String> subjects;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Professor [id=%s, name=%s, address=%s, subjects=%s]", id, name, address, subjects);
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
