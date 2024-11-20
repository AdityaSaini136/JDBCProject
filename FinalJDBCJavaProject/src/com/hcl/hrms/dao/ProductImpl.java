package com.hcl.hrms.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.hcl.hrms.util.DatabaseUtility;

public  class ProductImpl implements IProduct {

	String createQuerySQL="create table product(pid varchar(30),pname varchar(50))";
	String insertQuerySQL="insert into product values('A001','Laptop')";
	String updateQuerySQL="update product set pname='Mobile'";
	String deleteQuerySQL="delete from product";
	String selectQuerySQL="select * from product";
	Connection con=null;
	Statement stmt=null;
	public void createTable() {
		try {
			con = DatabaseUtility.getDatabaseConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(createQuerySQL);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void insertTable() {
		try {
			con  = DatabaseUtility.getDatabaseConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(insertQuerySQL);
			DatabaseUtility.closeConnection(con, stmt);
			System.out.println("Record inserted successfully !!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateTable() {
		try {
			con  = DatabaseUtility.getDatabaseConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(updateQuerySQL);
			DatabaseUtility.closeConnection(con, stmt);
			System.out.println("Record updated successfully !!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteTable() {
		try {
			con  = DatabaseUtility.getDatabaseConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(deleteQuerySQL);
			DatabaseUtility.closeConnection(con, stmt);
			System.out.println("Table is Delete successfully !!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void selectTable() {
		try {
			con  = DatabaseUtility.getDatabaseConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(selectQuerySQL);
			DatabaseUtility.closeConnection(con, stmt);
			System.out.println("Record Select successfully !!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
