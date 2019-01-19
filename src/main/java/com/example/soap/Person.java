package com.example.soap;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

	private String name;
	private int age;
	private String gender;
	private List<String> kids;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getKids() {
		return kids;
	}
	public void setKids(List<String> kids) {
		this.kids = kids;
	}
	
	
	
	
}
