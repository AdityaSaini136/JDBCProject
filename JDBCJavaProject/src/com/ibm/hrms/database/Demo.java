package com.ibm.hrms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static String username ="jdbc:mysql://localhost:3306/abc";
	public static String userName = "root";
	public static String userPass = "root";
	public static String insertQ = "insert into oppo values ('12', 'Aditya', 'saini')";
	public static String updateQ = "update oppo set name='Rinku' where id =12";
	public static String deleteQ = "delete from oppo where id=12";
	public static String selectQ = "select * from oppo";
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(username, userName, userPass);
			Statement stmt = con.createStatement();
			ResultSet eup = stmt.executeQuery(insertQ);
			//int eup1 = stmt.executeUpdate(insertQ);
			System.out.println(eup);
//			while(eup.next()) {
//				String string = eup.getString(1);
//				String string2 = eup.getString(2);
//				System.out.println(string + "Data Insert...."+ string2);
//			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}