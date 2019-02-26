package com.luve2code.entity;

public class Cv {
	
	private String name;
	private String firstName;
	private String age;
	private String niveau;
	
	@Override
	public String toString() {
		return "Cv [name=" + name + ", firstName=" + firstName + ", age=" + age + ", niveau=" + niveau + "]";
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public Cv() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setAge(String age) {
		this.age = age;
	}

}
