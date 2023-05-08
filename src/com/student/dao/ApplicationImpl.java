package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.student.model.Applications;
import com.student.util.ConnectionUtil;
import com.student.validation.Validaition;

public class ApplicationImpl implements ApplicationDao{
 Validaition valid=new Validaition();
	@Override
	public void saveApplication(Applications app) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String insert="insert into application (date,user_id,number_of_applications)values(?,?,?)";
		boolean id=valid.idValidation(app.getUserId());
		boolean number=valid.numberValidation(app.getNumberOfApplication());
		if(id==true&&number==true)
		{
			PreparedStatement ps=con.prepareStatement(insert);
			ps.setInt(1,app.getUserId());
			ps.setInt(2, app.getNumberOfApplication());
			int executeUpdate = ps.executeUpdate();
			System.out.println(executeUpdate);
		}
	}

	@Override
	public List<Applications> applicationList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		String display="select id,date,user_id,number_of_application from application ";
		PreparedStatement ps=con.prepareStatement(display);
		ResultSet rs=ps.executeQuery();
		ArrayList<Applications> applicationList=new ArrayList<>();
		while(rs.next())
		{
		int id=rs.getInt(1);
		Date date=rs.getDate(2);
		int userId=rs.getInt(3);
		int no=rs.getInt(4);
		Applications app=new Applications();
		app.setId(id);
		app.setDate((java.sql.Date) date);
		app.setUserId(userId);
		app.setNumberOfApplication(no);
		applicationList.add(app);
		}
		return applicationList;
	}

	@Override
	public int deleteApplicationDetails() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con=ConnectionUtil.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want delete application\n Enter Application ID");
		int applicationId=sc.nextInt();
		String delete="delete from application where id=?";
		PreparedStatement ps=con.prepareStatement(delete);
		ps.setInt(1, applicationId);
		int executeUpdate = ps.executeUpdate();
		System.out.println(executeUpdate);
		return executeUpdate;
		
	}

}
