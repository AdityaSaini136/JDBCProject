package com.kuhada.service;

import java.util.List;

import com.kuhada.dao.EmployeeDao;
import com.kuhada.model.Employee;

public class EmployeeService {
	
	private EmployeeDao employeeDao;
	
	public EmployeeService(){
		this.employeeDao  = new EmployeeDao();
	}
	
	public boolean save(Employee employee) {
		// business logic
		return employeeDao.save(employee);
	}

	public List<Employee> getAll() {
		// business logic
		return employeeDao.getAll();
	}

	public List<Employee> getEmployee(String columnName, String columnValue) {
		
		return employeeDao.getEmployee(columnName, columnValue);
	}

	public boolean update(Employee employee) {
		return employeeDao.update(employee);
	}

	

	
}
