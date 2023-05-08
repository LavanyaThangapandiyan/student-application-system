package com.student.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.login.details.Login;
import com.student.dao.ApplicationImpl;
import com.student.model.Applications;
import com.student.util.ConnectionUtil;

public class TestApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//ConnectionUtil.getConnection();
		Login login=new Login();
		ApplicationImpl app=new ApplicationImpl();
		Applications apps=new Applications();
		Scanner sc=new Scanner(System.in);
		System.out.println("Admin login Enter==> 1 \n User Login Enter==> 2");
		int number=sc.nextInt();
		if(number==1)
		{
			System.out.println("Enter Your Admin Id");
			int adminId=sc.nextInt();
			boolean admin=login.adminLoginDetails(adminId);
			if(admin==true)
			{
				List<Applications> applicationList = app.applicationList();
				System.out.println(applicationList);
			}
			
		}
		else if(number==2)
		{
			System.out.println("Enter your User Id");
			int userId=sc.nextInt();
			boolean id=login.userLoginDetails(userId);
			if(id==true)
			{
				System.out.println("Choose the option \n 1. Insert Application \n 2.delete Application");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
				{
					System.out.println("Enter User ID");
					int id1=sc.nextInt();
					System.out.println("Enter Number of Applications");
					int count=sc.nextInt();
					apps.setUserId(id1);
					apps.setNumberOfApplication(count);
					app.saveApplication(apps);
					break;
				}
				case 2:
				{
					app.deleteApplicationDetails();
					break;
				}
				}
			}
		}
		

	}

}
