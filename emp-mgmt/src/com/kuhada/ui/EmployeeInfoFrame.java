package com.kuhada.ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.kuhada.model.Employee;
import com.kuhada.service.EmployeeService;
import com.kuhada.validation.ValidationUtil;


public class EmployeeInfoFrame	{
	
	EmployeeService employeeService = new EmployeeService();
	
	public void start() {
		JFrame frame = new JFrame();
		frame.setSize(800, 800);
		
		JTextField txtFieldId = new JTextField("Enter Id");
		txtFieldId.setBounds(100, 100, 200, 50);
		txtFieldId.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				System.out.println(keyChar);
				if(!Character.isDigit(keyChar)) {
					//JOptionPane.showMessageDialog(null, "Enter numbers only");
					txtFieldId.setText("");
				}
				
			}
		});
		
		JTextField txtFieldName= new JTextField("Enter Name");
		txtFieldName.setBounds(100, 250, 200, 50);
		
		JTextField txtFieldSalary = new JTextField("100");
		txtFieldSalary.setBounds(100, 400, 200, 50);
		
		JTextArea txtArea = new JTextArea("Enter Address");
		txtArea.setRows(5);
		txtArea.setBounds(100, 550, 200, 50);
		
		JButton saveButton = new JButton("Save");
		saveButton.setBounds(500, 500, 100, 50);
		
		JButton showButton = new JButton("Show");
		showButton.setBounds(350, 500, 100, 50);
		showButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				List<Employee> employees = employeeService.getAll();
				showEmployeeTable(employees);
			}

			private void showEmployeeTable(List<Employee> employees) {
				JFrame resultFrame = new JFrame();
				resultFrame.setSize(600, 600);
				
				String data[][]  = new String[employees.size()][4] ;
				
				for (int i = 0; i < employees.size(); i++) {
					data[i][0] = employees.get(i).getId()+"";
					data[i][1] = employees.get(i).getName();
					data[i][2] = employees.get(i).getSalary()+"";
					data[i][3] = employees.get(i).getAdderss();
				}
				
				String columnNames[] = {"Id", "Name", "Salary", "Address"};
				
				JTable jTable = new JTable(data, columnNames);
				jTable.setBounds(10,10,500,500);
				
				resultFrame.add(jTable);
				
				resultFrame.setVisible(true);
			}
		});
		
		
		
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Extracting data from form/UI
				String id = txtFieldId.getText();
				String name = txtFieldName.getText();
				String salary = txtFieldSalary.getText();
				String address = txtArea.getText();
				
				Employee employee = new Employee();
				employee.setName(name);
				employee.setAddress(address);
				employee.setId(Integer.parseInt(id));
				employee.setSalary(Double.parseDouble(salary));
				//add values in employee object
				boolean result  = ValidationUtil.validateEmployeeInfo(employee);
				
				// true call save method from service class 
				if(result){
					
					employeeService.save(employee);
					}
				
				JOptionPane.showMessageDialog(null, "Employee Saved");

			}
		});
		
		
		JButton editButton = new JButton("Edit record");
		editButton.setBounds(350, 350, 100, 50);
		editButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = txtFieldId.getText();
				List<Employee> employees = employeeService.getEmployee("id", id);
				txtFieldName.setText(employees.get(0).getName());
				txtFieldSalary.setText(employees.get(0).getSalary()+"");
				txtArea.setText(employees.get(0).getAdderss());
			}
		});
		
		JButton deleteButton = new JButton("Delete");
		deleteButton.setBounds(650, 350, 100, 50);
		deleteButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		JButton searchButton = new JButton("SearchById");
		searchButton.setBounds(400, 200, 100, 50);
		searchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = txtFieldId.getText();
				
				List<Employee> employees = employeeService.getEmployee("id", id);
				
				if(Objects.nonNull(employees) && !employees.isEmpty()) {
					showEmployeeTable(employees);
				}else {
					JOptionPane.showMessageDialog(null, "No record found with given id: "+id);
				}
				
			}
			
			
			

			private void showEmployeeTable(List<Employee> employees) {
				JFrame resultFrame = new JFrame();
				resultFrame.setSize(600, 600);
				
				String data[][]  = new String[employees.size()][4] ;
				
				for (int i = 0; i < employees.size(); i++) {
					data[i][0] = employees.get(i).getId()+"";
					data[i][1] = employees.get(i).getName();
					data[i][2] = employees.get(i).getSalary()+"";
					data[i][3] = employees.get(i).getAdderss();
				}
				
				String columnNames[] = {"Id", "Name", "Salary", "Address"};
				
				JTable jTable = new JTable(data, columnNames);
				jTable.setBounds(10,10,500,500);
				
				resultFrame.add(jTable);
				
				resultFrame.setVisible(true);
			}
		});
		
		JButton updateButton = new JButton("Update record");
		updateButton.setBounds(500, 350, 100, 50);
		updateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Extracting data from form/UI
				String id = txtFieldId.getText();
				String name = txtFieldName.getText();
				String salary = txtFieldSalary.getText();
				String address = txtArea.getText();
				
				Employee employee = new Employee();
				employee.setName(name);
				employee.setAddress(address);
				employee.setId(Integer.parseInt(id));
				employee.setSalary(Double.parseDouble(salary));
				//add values in employee object
				boolean result  = ValidationUtil.validateEmployeeInfo(employee);
				
				// true call save method from service class 
				if(result){
					boolean res = employeeService.update(employee);
					if(res) {
						JOptionPane.showMessageDialog(null,"Record updated");
					}else {
						JOptionPane.showMessageDialog(null,"record could not updated");
					}
				}
				
				
			}
		});	
		
		
		JButton searchByNameButton = new JButton("SearchByName");
		searchByNameButton.setBounds(500, 200, 200, 50);
		searchByNameButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String name = txtFieldName.getText();
				
				List<Employee> employees = employeeService.getEmployee("name", name);
				
				if(Objects.nonNull(employees) && !employees.isEmpty()) {
					showEmployeeTable(employees);
				}else {
					JOptionPane.showMessageDialog(null, "No record found with given name: "+name);
				}
				
				
			}
			
			private void showEmployeeTable(List<Employee> employees) {
				JFrame resultFrame = new JFrame();
				resultFrame.setSize(600, 600);
				
				String data[][]  = new String[employees.size()][4] ;
				
				for (int i = 0; i < employees.size(); i++) {
					data[i][0] = employees.get(i).getId()+"";
					data[i][1] = employees.get(i).getName();
					data[i][2] = employees.get(i).getSalary()+"";
					data[i][3] = employees.get(i).getAdderss();
				}
				
				String columnNames[] = {"Id", "Name", "Salary", "Address"};
				
				JTable jTable = new JTable(data, columnNames);
				jTable.setBounds(10,10,500,500);
				
				resultFrame.add(jTable);
				
				resultFrame.setVisible(true);
			}
		});
		
		
		
		frame.add(txtFieldId);
		frame.add(txtFieldName);
		frame.add(txtFieldSalary);
		frame.add(txtArea);
		frame.add(saveButton);
		frame.add(showButton);
		frame.add(searchButton);
		frame.add(deleteButton);
		frame.add(editButton);
		frame.add(searchByNameButton);
		frame.add(updateButton);
		
		frame.setTitle("SWING");
		
		frame.setLayout(null);
		frame.setVisible(true);
	}
}

