package com.kuhada.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kuhada.model.Employee;
import com.kuhada.util.DBUtil;

public class EmployeeDao {

	public boolean save(Employee employee) {

		try {
			//2. Open Connection
			Connection connection = DBUtil.getConnection();

			String sql = "INSERT INTO EMPLOYEE (ID, NAME, SALARY, ADDRESS) VALUES (?, ?, ?, ?)";
			//3. Create Statement or PrepareStatement
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, employee.getId());
			statement.setString(2, employee.getName());
			statement.setDouble(3, employee.getSalary());
			statement.setString(4, employee.getAdderss());
			
			//4.Execute query with the help of statement/prepared statement
			boolean result = statement.execute();

			// 5. extracts result set

			//6. close connection
			connection.close();
			return result;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}



	public List<Employee> getAll(){

		try {
			
			//2. Open Connection
			Connection connection = DBUtil.getConnection();

			//3. Create Statement or PrepareStatement
			Statement statement = connection.createStatement();

			String sql = "SELECT * FROM EMPLOYEE";

			//4.Execute query with the help of statement/prepared statement
			ResultSet resultSet = statement.executeQuery(sql );

			List<Employee> employees = new ArrayList<Employee>();
			// 5. extracts result set
			while (resultSet.next()) {
				//Get data from result set
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				double salary = resultSet.getDouble("salary");
				String adderss = resultSet.getString("address");
				
				//create new employee and set data into that
				Employee employee = new Employee();
				employee.setId(id);
				employee.setName(name);
				employee.setSalary(salary);
				employee.setAddress(adderss);
				
				// add newly created employee into list
				employees.add(employee);
			}

			//6. close connection
			connection.close();
			return employees;

		} catch ( SQLException e) {
			e.printStackTrace();
		}

		return null;

	}



	public List<Employee> getEmployee(String columnName, String columnValue) {
		try {

			//2. Open Connection
			Connection connection = DBUtil.getConnection();

			//3. Create Statement or PrepareStatement
			Statement statement = connection.createStatement();

			String sqlQuery = null;
			if("id".equals(columnName)) {
				sqlQuery = "SELECT * FROM EMPLOYEE where Id  = "+columnValue;
			}else if("name".equals(columnName)) {
				sqlQuery = "SELECT * FROM EMPLOYEE where name  LIKE '%"+columnValue+"%'";
			}
			
			System.out.println(sqlQuery);

			//4.Execute query with the help of statement/prepared statement
			ResultSet resultSet = statement.executeQuery(sqlQuery);

			List<Employee> employees = new ArrayList<Employee>();
			
			// 5. extracts result set
			while (resultSet.next()) {
				//Get data from result set
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				double salary = resultSet.getDouble("salary");
				String adderss = resultSet.getString("address");

				//create new employee and set data into that
				Employee employee = new Employee();
				employee.setId(id);
				employee.setName(name);
				employee.setSalary(salary);
				employee.setAddress(adderss);
				employees.add(employee);
			}
			

			//6. close connection
			connection.close();
			
			return employees;

		} catch ( SQLException e) {
			e.printStackTrace();
		}

		return null;
	}



	public boolean update(Employee employee) {
		Connection connection = null;
		try {
			//2. Open Connection
			connection = DBUtil.getConnection();

			String sql = "UPDATE EMPLOYEE SET NAME = ?, SALARY = ?, ADDRESS = ? WHERE ID = ?";
			//3. Create Statement or PrepareStatement
			PreparedStatement statement = connection.prepareStatement(sql);
			
			System.out.println(sql);
			
			statement.setString(1, employee.getName());
			statement.setDouble(2, employee.getSalary());
			statement.setString(3, employee.getAdderss());
			statement.setInt(4, employee.getId());
			
			//4.Execute query with the help of statement/prepared statement
			return statement.executeUpdate() > 0;

			// 5. extracts result set

			//6. close connection
			

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;
		
	}


}
