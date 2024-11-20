package com.ibm.hrms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlAllConnectionType {
	private static String url = "jdbc:mysql://localhost:3306/sunildb";
	private static String username = "root";
	private static String password = "root";
	private static String insertQuery = "insert into customer(custid,custname) values('A002','Java2')";
	private static String deleteQuery =  "delete from customer where custid = 'A001' ";
	private static String updateQuery =  "update customer set custname='SCALA' where custid = 'A002' ";
	private static String selectQuery =  "select * from customer";
	public static void main(String[] args) {
		insertIntoDatabase();
	}
	public static void insertIntoDatabase() {
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			ResultSet executeQuery = stmt.executeQuery(selectQuery);
			while( executeQuery.next()) {
				String string = executeQuery.getString(1);
				String string4 = executeQuery.getString(2);
				String string3 = executeQuery.getString("custid");
				String string2 = executeQuery.getString("custname");
				System.out.println(string3+" : "+string2);
			}
        	//int queryResult = stmt.executeUpdate(selectQuery);
			//System.out.println("Query Executed Successfully :>>>> " + queryResult);
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}