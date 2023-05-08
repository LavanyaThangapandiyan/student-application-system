package com.student.model;

import java.sql.Date;

public class Payment {
private int id;
private Date date;
private String name;
private int userId;
private int applicationId;
private int amount;
public Payment()
{
	
}
public Payment(int id,Date date,String name,int userId,int applicationId,int amount)
{
	this.id=id;
	this.date=date;
	this.name=name;
	this.userId=userId;
	this.applicationId=applicationId;
	this.amount=amount;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getApplicationId() {
	return applicationId;
}
public void setApplicationId(int applicationId) {
	this.applicationId = applicationId;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Payment [id=" + id + ", date=" + date + ", name=" + name + ", userId=" + userId + ", applicationId="
			+ applicationId + ", amount=" + amount + "]";
}

}
