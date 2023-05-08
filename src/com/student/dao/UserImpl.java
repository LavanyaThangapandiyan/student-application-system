package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.student.model.User;
import com.student.util.ConnectionUtil;
import com.student.validation.Validaition;

public class UserImpl implements UserDao {
Validaition valid=new Validaition();
	@Override
	public void saveUserDetails(User user) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String insert="insert into userr(name,email,phone_number)values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(insert);
		boolean name=valid.nameValidation(user.getName());
		boolean email=valid.emailValidation(user.getEmail());
		boolean phn=valid.phoneNumberValidation(user.getPhoneNumber());
		if(name==true&&email==true&&phn==true)
		{
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPhoneNumber());
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate);
		}else
			System.out.println("Invalid data");
		
	}

	@Override
	public List<User> userList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String display="select id,name,email,phone_number from userr";
		PreparedStatement ps=con.prepareStatement(display);
		ResultSet rs=ps.executeQuery();
		ArrayList<User> userList=new ArrayList<>();
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			String email=rs.getString(3);
			String phnno=rs.getString(4);
			User userobj=new User();
			userobj.setId(id);
			userobj.setName(name);
			userobj.setEmail(email);
			userobj.setPhoneNumber(phnno);
			userList.add(userobj);
		
		}
		return userList;
	}

	@Override
	public int deleteUserDetails() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want delete User Details \n Enter Userr Id");
		int userId=sc.nextInt();
		String delete="delete from userr where id=?";
		PreparedStatement ps=con.prepareStatement(delete);
		ps.setInt(1, userId);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;
	}

	@Override
	public void updateUserName(int userId,String name) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String update="update userr set name=? where id=?";
		boolean name1=valid.nameValidation(name);
		boolean id=valid.idValidation(userId);
		if(name1==true&&id==true)
		{
			PreparedStatement ps=con.prepareStatement(update);
			ps.setString(1,name );
			ps.setInt(2, userId);
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate);
		}
		else
			System.out.println("Invalid Data");
		
		
	}

	@Override
	public void updatePhoneNumber(int userId, String phoneNumber) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String update="update userr set password=? where id=?";
		boolean phonenum=valid.phoneNumberValidation(phoneNumber);
		boolean id=valid.idValidation(userId);
		if(phonenum==true&&id==true)
		{
			PreparedStatement ps=con.prepareStatement(update);
			ps.setString(1,phoneNumber);
			ps.setInt(2, userId);
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate);
		}
		
	}

	@Override
	public void updateEmail(int userId, String email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String update="update userr set phone_number=? where id=?";
		boolean em=valid.emailValidation(email);
		boolean id=valid.idValidation(userId);
		if(em==true && id==true)
		{
			PreparedStatement ps=con.prepareStatement(update);
			ps.setString(1,email);
			ps.setInt(2, userId);
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate);
			
		}
		
	}

	
}
