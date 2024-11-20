package com.ibm.hrms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewJdbcprograming {
	private static String url = "jdbc:mysql://localhost:3306/coredb";
	private static String username = "root";
	private static String password = "root";
	private static String selectQuery = "select * from employeetext";

	public static void main (String[]args)	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectQuery);
			System.out.println("1");
			while(rs.next())
			{
				System.out.println("2");
				String customerID = rs.getString("empid");
				String customerName = rs.getString("empname");
				System.out.println(customerID + ":" +customerName);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch(ClassNotFoundException e ) {
			e.printStackTrace();
		}catch (SQLException e) {
		}
		System.out.println("3");
	}
}