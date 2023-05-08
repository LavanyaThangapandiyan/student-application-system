package com.student.model;

public class Admin 
{
	private int id;
	private String name;
	private String password;
	private int DepartmentId;
	public Admin()
	{
		
	}
	public Admin(int id,String name,String Password,int DepartmentId)
	{
		this.id=id;
		this.name=name;
		this.password=password;
		this.DepartmentId=DepartmentId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getDepartmentId() {
		return DepartmentId;
	}
	public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + ", DepartmentId=" + DepartmentId + "]";
	}
	

}
