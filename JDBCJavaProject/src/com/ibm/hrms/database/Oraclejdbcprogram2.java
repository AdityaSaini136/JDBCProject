package com.ibm.hrms.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Oraclejdbcprogram2 {
	private static String url = "jdbc:oracle:thin@localhost:1521/xe";
	private static String username = "system";
	private static String password = "aadi";
	private static String selectQuery = "select * from  employee";
	public static void main(String[] args){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("2");
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("4");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(selectQuery);
			System.out.println("1");
			while(rs.next()) {
				String empid = rs.getString("empid");
				String empname = rs.getString("empname");
				System.out.println(empid + ":" + empname  );
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 

}


