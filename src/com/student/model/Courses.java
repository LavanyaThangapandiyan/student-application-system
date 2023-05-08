package com.student.model;

public class Courses {
	private int id;
	private String name;
	private String courseMode;
	private int fees;
	private String departmentName;
	public Courses()
	{
		
	}
public Courses (int id,String name,String courseMode,int fees,String departmentName)
{
	this.id=id;
	this.name=name;
	this.courseMode=courseMode;
	this.fees=fees;
	this.departmentName=departmentName;
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
public String getCourseMode() {
	return courseMode;
}
public void setCourseMode(String courseMode) {
	this.courseMode = courseMode;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
@Override
public String toString() {
	return "Courses [id=" + id + ", name=" + name + ", courseMode=" + courseMode + ", fees=" + fees
			+ ", departmentName=" + departmentName + "]";
}

}
