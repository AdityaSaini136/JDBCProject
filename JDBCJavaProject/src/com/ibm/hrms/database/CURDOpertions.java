package com.ibm.hrms.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CURDOpertions {

	public static String url = "jdbc:mysql://localhost:3306/Ruf"; 
	public static String userName   = "root";
	public static String userPass   = "root";
	public static String createTable = "create table SONA(ID int AUTO_INCREMENT,PRIMARY KEY(ID), name varchar(20), fatherName varchar(30), mobileNo varchar(12), address varchar(30))";////for create table executeUpdate return 0 value
	public static String dropTable  = "drop table students";//for drop executeUpdate return 0 value
	public static String insertTable  = "insert into SONA(name,fatherName,mobileNo,address) values('SOna','YUY', '9084067443','Haridwar')";////for insert executeUpdate return 1 value
	public static String updateTable  = "update student set fatherName='Rafal', mobileNo='9078664879',address='Roorkee' where name='Aditya'";//they return no of data are update 
	public static String deleteData  = "delete from student where name = 'Aditya'";//they return no of data are delete 
	public static String selectData  = "select * from SONA";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, userPass);
			PreparedStatement prepareStatement = con.prepareStatement(selectData);// This query is for select data from table 
			Statement crtstmt = con.createStatement();// We have two method for select query one iscon.prepareStatement(selectData); Second is - con.createStatement();
			ResultSet resultSet = prepareStatement.executeQuery();// This query is also for select data from table 
			while(resultSet.next()) {
				String s1 = resultSet.getString(1);//Basically these variables are picks the values with the help of column no. 
				String s2 = resultSet.getString(2);
				String s3 = resultSet.getString(3);
				String s4 = resultSet.getString(4);
				String s5 = resultSet.getString(5);
				System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5);
			}
//			int executeUpdate = crtstmt.executeUpdate(selectData);// This query is for table create, insert, delete, update
//			System.out.println("selectData : "+executeUpdate);
//			if(executeUpdate==0) {
//				System.out.println("selectData....!");
//			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}