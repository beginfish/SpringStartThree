
package com.bamdow.service;

public class Teacher {
	private String name;
	private int age;
	
	public Teacher(){
		System.out.println("Teacher init");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public String toString(){
		return "Teacher{name:"+name+",age:"+age+"}";
	}
}
