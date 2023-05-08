package com.student.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.login.details.Login;
import com.student.dao.AdminImpl;
import com.student.model.Admin;
import com.student.util.ConnectionUtil;
import com.student.validation.Validaition;

public class TestAdmin {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Login login=new Login();
		AdminImpl admin=new AdminImpl();
		Admin adminobj=new Admin();
		ConnectionUtil.getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Admin Login ==>\n If you Are Exsisting Admin Please Enter ==>1  New Admin Enter ==>2 ");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println(" Enter your Id Here : ");
			int adminId=sc.nextInt();
			boolean id=login.adminLoginDetails(adminId);
			if(id==true)
			{
			  System.out.println("Update Name Enter==>1 \n Update Password Enetr==>2 \n Delete Admin Details==>3");	
			  int option=sc.nextInt();
			  switch(option)
			  {
			  case 1:
			  {
				  System.out.println("Enter Your Admin Id Here:");
				  int adminId1=sc.nextInt();
				  System.out.println("Enter your New Name of admin");
				  String name=sc.next();
				  adminobj.setId(adminId1);
				  adminobj.setName(name);
				  admin.updateAdminName(adminId1, name);
				  break;
			  }
			  case 2:
			  {
				  System.out.println("Enter Your Admin Id Here:");
				  int adminId1=sc.nextInt();
				  System.out.println("Enter Your New Password");
				  String password=sc.next();
				  adminobj.setId(adminId1);
				  adminobj.setPassword(password);
				  admin.updateAdminPassword(adminId1, password);
				  break;
			  }
			  case 3:
			  {
				  admin.deleteAdminDetails();
				  break;
			  }
			  }
			}
		}
		else if(choice==2)
		{
			System.out.println("Enter your Name:");
			String name=sc.next();
			System.out.println("Enter your Password:");
			String password=sc.next();
			System.out.println("Enter Department Id");
			int departmentId=sc.nextInt();
			adminobj.setName(name);
			adminobj.setPassword(password);
			adminobj.setDepartmentId(departmentId);
			admin.saveAdminDetails(adminobj);
		}
		
		

	}

}
