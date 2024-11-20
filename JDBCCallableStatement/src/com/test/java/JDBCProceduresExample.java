package com.test.java;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class JDBCProceduresExample {
	public static void main(String[] args)   {
		try {
			Connection connection = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/callable","root", "root");
			CallableStatement cs = connection.prepareCall("{call square (?,?)}");	
			cs.setInt(1, 20);
			cs.registerOutParameter(2,Types.INTEGER);
			System.out.println("Square result:= " + cs.getInt(2));
			cs.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
