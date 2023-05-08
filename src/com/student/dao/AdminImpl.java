package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.student.model.Admin;
import com.student.util.ConnectionUtil;
import com.student.validation.Validaition;

public class AdminImpl implements AdminDao {
 Validaition valid=new Validaition();
	@Override
	public void saveAdminDetails(Admin admin) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String insert="insert into admin (name,password,department_id)values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(insert);
		boolean name=valid.nameValidation(admin.getName());
		boolean password=valid.passwordValidation(admin.getPassword());
		boolean departmentid=valid.idValidation(admin.getDepartmentId());
		if(name==true&&password==true&&departmentid==true)
		{
		ps.setString(1, admin.getName());
		ps.setString(2,admin.getPassword());
		ps.setInt(3, admin.getDepartmentId());
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		}
		else
			System.out.println("Invalid Admin Details");
		
		
	}

	@Override
	public void deleteAdminDetails() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Admin Id");
		int adminId=sc.nextInt();
		String delete="delete from admin where id=?";
		PreparedStatement ps=con.prepareStatement(delete);
		ps.setInt(1, adminId);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);	
		
	}

	@Override
	public void updateAdminName(int adminId, String name) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String update="update admin set name=? where id=?";
		boolean name1=valid.nameValidation(name);
		boolean id=valid.idValidation(adminId);
		if(name1==true&&id==true)
		{
			PreparedStatement ps=con.prepareStatement(update);
			ps.setString(1,name );
			ps.setInt(2, adminId);
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate);
		}
		else
			System.out.println("Invalid Data");
		
		
		
		
	}

	@Override
	public void updateAdminPassword(int adminId, String password) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String update="update admin set password=? where id=?";
		boolean password1=valid.passwordValidation(password);
		boolean id=valid.idValidation(adminId);
		if(password1==true&&id==true)
		{
			PreparedStatement ps=con.prepareStatement(update);
			ps.setString(1,password);
			ps.setInt(2, adminId);
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate);
		}
		
		
	}

}
