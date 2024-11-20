package com.ibm.hrms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	private static  String  url = "jdbc:mysql://localhost:3306/demo2";
	private static  String  userName = "root";
	private static  String  userPass = "root";
	private static  String  createTab = "create table StudentList (id int not null primary key(id)"
			+ " auto_increment, SName varchar(90), Skills varchar(255))";
	private static  String  insertData = "insert into StudentList values('Aditya saini','Java Developer')";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, userPass);
			Statement stmt = con.createStatement();
			int ctab = stmt.executeUpdate(createTab);//for insert delete update 
			int insdata = stmt.executeUpdate(insertData);
			ResultSet rs = stmt.executeQuery(url);//for select all data 
			
			PreparedStatement ptmt = con.prepareStatement(null);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}  		
	}
}