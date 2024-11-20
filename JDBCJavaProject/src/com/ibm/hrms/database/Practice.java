package com.ibm.hrms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {

	public static String  url = "jdbc:mysql://localhost:3306/practice";
	public static String  userName = "root";
	public static String  userPass = "root";
	public static String  createQuery = "Create table Dadaa(PersondID int not null Auto_Increment,"
			+ " primary key(PersondID), Name varchar(50),fatherName varchar(50),rollnumber int(10))"; 
	public static String  insertQuery = "insert into Dadaa(Name,fatherName,rollnumber) values('Sonam','Tejtakj','87')"; 
	public static String  selectQuery = "select * from Dadaa"; 
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, userPass);
			Statement createStatement = con.createStatement();
			//int executeUpdate = createStatement.executeUpdate(insertQuery);
			ResultSet resultSet = createStatement.executeQuery(selectQuery);
			while(resultSet.next()) {
				String s1 = resultSet.getString(1); 
				String s2 = resultSet.getString(2);
				String s3 = resultSet.getString(3);
				String s4 = resultSet.getString(4);
				System.out.println(s1+" "+s2+" "+s3+" "+s4);
			}
			//			if(executeUpdate == 1) {
			//				System.out.println("Table Created.....!");
			//			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
