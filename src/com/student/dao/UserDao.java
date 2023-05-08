package com.student.dao;

import java.sql.SQLException;
import java.util.List;

import com.student.model.User;

public interface UserDao {
	public void saveUserDetails(User user) throws ClassNotFoundException, SQLException;
	public List<User> userList() throws ClassNotFoundException, SQLException;
	public int deleteUserDetails() throws ClassNotFoundException, SQLException;
	public void updateUserName(int userId,String name) throws ClassNotFoundException, SQLException;
	public void updatePhoneNumber(int userId,String phoneNumber) throws ClassNotFoundException, SQLException;
	public void updateEmail(int userId,String email) throws ClassNotFoundException, SQLException;
	

}
