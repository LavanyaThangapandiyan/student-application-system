package com.student.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.login.details.Login;
import com.student.dao.UserImpl;
import com.student.model.User;
import com.student.util.ConnectionUtil;

public class TestUser {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//ConnectionUtil.getConnection();
		Login login=new Login();
		UserImpl user=new UserImpl();
		User userobj=new User();
		Scanner sc=new Scanner(System.in);
		System.out.println("Admin Login ==>Enter 1 \n User Login ==>2");
		int number=sc.nextInt();
		if(number==1)
		{
			System.out.println("Enter Admin Id ");
			int adminId=sc.nextInt();
			boolean id=login.adminLoginDetails(adminId);
			if(id==true)
			{
				System.out.println("Show User List");
				List<User> userList = user.userList();
				System.out.println(userList);
			}
		}
		else if(number==2)
		{
			System.out.println("1.Insert User Details \n 2. Update UserName  \n 3.Update Phone Number \n 4.Update Email \n 5.Delete User Details");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
			{
				System.out.println("Enter User Name");
				String name=sc.next();
				System.out.println("Enter Email");
				String email=sc.next();
				System.out.println("Enter Phone number");
				String phoneNumber=sc.next();
				userobj.setName(name);
				userobj.setEmail(email);
				userobj.setPhoneNumber(phoneNumber);
				user.saveUserDetails(userobj);
				break;
			}
			case 2:
			{
				System.out.println("Enter user Id");
				int userId=sc.nextInt();
				System.out.println("Enter new Name");
				String name=sc.next();
				userobj.setName(name);
				userobj.setId(userId);
				user.updateUserName(userId, name);
			}
			case 3:
			{
			System.out.println("Enter user Id");
			int userId=sc.nextInt();
			System.out.println("Enter new Phone Number");
			String phoneNumber=sc.next();
			userobj.setId(userId);
			userobj.setPhoneNumber(phoneNumber);
			user.updatePhoneNumber(userId, phoneNumber);
			break;
			}
			case 4:
			{
				System.out.println("Enter user Id");
				int userId=sc.nextInt();
				System.out.println("Enter new Email");
				String email=sc.next();
				userobj.setId(userId);
				userobj.setEmail(email);
				user.updateEmail(userId, email);
				break;	
			}
			case 5:
			{
				user.deleteUserDetails();
			}
			}
		}

	}

}
