package com.kuhada.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	private static final String DB_NAME = "payroll_db";
	private static final String USER_NAME = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/"+DB_NAME;
	private static final String PASSWORD = "root";
	
	public static Connection getConnection() {
		

		try {
			//1. Load Driver class 
			Class.forName("com.mysql.cj.jdbc.Driver");

			//2. Open Connection
			return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		}catch (Exception e) {
			System.out.println("Unable to open connection");
		}
		
		return null;
	}
}
