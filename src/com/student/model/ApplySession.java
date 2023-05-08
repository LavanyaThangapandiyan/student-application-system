package com.student.model;

public class ApplySession {
private int id;
private int applicationId;
private int courseId;
private int fees;
private int numberOfDepartment;
public ApplySession()
{
	
}
public ApplySession(int id,int applicationId,int courseId,int fees,int numberOfDepartment)
{
	this.id=id;
	this.applicationId=applicationId;
	this.courseId=courseId;
	this.fees=fees;
	this.numberOfDepartment=numberOfDepartment;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getApplicationId() {
	return applicationId;
}
public void setApplicationId(int applicationId) {
	this.applicationId = applicationId;
}
public int getCourseId() {
	return courseId;
}
public void setCourseId(int courseId) {
	this.courseId = courseId;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
public int getNumberOfDepartment() {
	return numberOfDepartment;
}
public void setNumberOfDepartment(int numberOfDepartment) {
	this.numberOfDepartment = numberOfDepartment;
}
@Override
public String toString() {
	return "ApplySession [id=" + id + ", applicationId=" + applicationId + ", courseId=" + courseId + ", fees=" + fees
			+ ", numberOfDepartment=" + numberOfDepartment + "]";
}

}
