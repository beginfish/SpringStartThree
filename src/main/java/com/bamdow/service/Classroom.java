package com.bamdow.service;

import org.springframework.stereotype.Component;

@Component
public class Classroom {

	private String name;
	
	private String location;

	public Classroom(){
		System.out.println("Classroom init");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString(){
		return "Classroom{name:"+name+",location:"+location+"}";
	}
}
