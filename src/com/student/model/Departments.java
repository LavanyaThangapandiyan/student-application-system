package com.student.model;

public class Departments {
	private int id;
	private int fees;
	private int courseId;
	public Departments()
	{
		
	}
	public Departments(int id,int fees,int courseId)
	{
		this.id=id;
		this.fees=fees;
		this.courseId=courseId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "Departments [id=" + id + ", fees=" + fees + ", courseId=" + courseId + "]";
	}
	

}
