package com.ibm.hrms.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CoreJdbcprograming {
	private static String url  =  "jdbc:mysql://localhost:3306/coredb";
	private static String username  = "root";
	private static String password = "root";
	private static String selectQuery = "select * from employeetext";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			PreparedStatement ps = con.prepareStatement(selectQuery);
			ResultSet executeQuery = ps.executeQuery();
			//ResultSet rs = stmt.executeQuery(selectQuery);
			while(executeQuery.next()) {
				String customerID = executeQuery.getString("empid");
				String  customerName = executeQuery.getString("empname");
				System.out.println(customerID+" "+customerName);
			}  
			executeQuery.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}