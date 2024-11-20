package com.ibm.hrms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MohaliJDBCPractice {

	private static String url="jdbc:mysql://localhost:3306/Mohali";
	private static String username="root";
	private static String password= "root";
	private static String createtable="create table sector127(MNo varchar(20),name varchar(30))";
	private static String updatequery = "update sector123 set makannumber='1200' where  name ='AnujSaini' ";
	private static String insertquery ="insert into sector124(MNo, name) values('2360','Aditya Saini')";
	private static String delectequery ="delete from sector123 where makannumber='1380' ";
	private static String selectquery ="select * from sector123";
	public static void main(String[] args) {
		getConnsql();
	}
	public static void getConnsql() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement stmt = connection.createStatement();
			PreparedStatement ps = connection.prepareStatement(selectquery);
			ResultSet resultSet1 = ps.executeQuery();
			//int executeUpdate2 = ps.executeUpdate();
		     //int executeUpdate = stmt.executeUpdate(createtable);
			ResultSet resultSet = stmt.executeQuery(selectquery);
					    while(resultSet.next()) {
							String m1 = resultSet.getString(1);
							String m2 = resultSet.getString(2);
							System.out.println(m1+ " " +m2);
						}
		//	System.out.println(executeUpdate2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
