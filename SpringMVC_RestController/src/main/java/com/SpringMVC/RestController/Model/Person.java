package com.SpringMVC.RestController.Model;

public class Person {
	private String Name;
	private int age;
	private String phone;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Person(String name, int age, String phone) {
		super();
		Name = name;
		this.age = age;
		this.phone = phone;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
