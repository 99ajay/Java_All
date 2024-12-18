package com.app_web_project.modal;

import java.sql.*;
public class DaoService {
	private Connection con;
	private Statement stmnt;
	
	public void connectdb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/app_projectdb","root","php@java");
			stmnt = con.createStatement();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeDB() {
		try {
			 con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from login where email='ajay@gmail.com' and password='testing'");
			return result.next();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public void addStudent(String name, String email, String mobile) {
		try {
			stmnt.executeUpdate("insert into registration values('"+name+"','"+email+"','"+mobile+"')");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public ResultSet getAllStudent() {
		try {
		ResultSet result = stmnt.executeQuery("select * from registration");
		return result;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
