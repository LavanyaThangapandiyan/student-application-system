package com.student.model;

import java.sql.Date;

public class Applications {
	private int id;
	private Date date;
	private int userId;
	private int numberOfApplication;
	public Applications()
	{
		
	}
	public Applications(int id,Date date,int userId,int numberOfApplication) {
		this.id=id;
		this.date=date;
		this.userId=userId;
		this.numberOfApplication=numberOfApplication;
		
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getNumberOfApplication() {
		return numberOfApplication;
	}
	public void setNumberOfApplication(int numberOfApplication) {
		this.numberOfApplication = numberOfApplication;
	}
	@Override
	public String toString() {
		return "Applications [id=" + id + ", date=" + date + ", userId=" + userId + ", numberOfApplication="
				+ numberOfApplication + "]";
	}
	

}
