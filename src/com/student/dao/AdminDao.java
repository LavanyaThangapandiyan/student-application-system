package com.student.dao;

import java.sql.SQLException;

import com.student.model.Admin;

public interface AdminDao {
	public void saveAdminDetails(Admin admin) throws ClassNotFoundException, SQLException;
	public void deleteAdminDetails() throws ClassNotFoundException, SQLException;
	public void updateAdminName(int adminId,String Name) throws ClassNotFoundException, SQLException;
    public void updateAdminPassword(int adminId,String password) throws ClassNotFoundException, SQLException;
}
