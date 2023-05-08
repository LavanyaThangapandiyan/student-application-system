package com.student.dao;

import java.sql.SQLException;
import java.util.List;

import com.student.model.Applications;

public interface ApplicationDao 
{
	public void saveApplication(Applications app) throws ClassNotFoundException, SQLException;
	public List<Applications> applicationList() throws ClassNotFoundException, SQLException;
	public int deleteApplicationDetails() throws ClassNotFoundException, SQLException;
}
