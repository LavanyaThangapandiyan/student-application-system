package com.student.model;

public class User {
	private int id;
	private String name;
	private String email;
	private String phoneNumber;
	public User()
	{
		
	}
	public User(int id,String name,String email,String phoneNumeber)
	{
	this.id=id;
	this.name=name;
	this.email=email;
	this.phoneNumber=phoneNumeber;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
