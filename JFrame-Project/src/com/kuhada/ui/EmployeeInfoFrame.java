package com.kuhada.ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.kuhada.model.Employee;
import com.kuhada.validation.ValidationUtil;


public class EmployeeInfoFrame	{
	
	public void start() {
		JFrame frame = new JFrame();
		frame.setSize(800, 800);
		
		JTextField txtFieldId = new JTextField("Enter Id");
		txtFieldId.setBounds(100, 100, 200, 50);
		txtFieldId.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				System.out.println(keyChar);
				if(!Character.isDigit(keyChar)) {
					JOptionPane.showMessageDialog(null, "Enter numbers only");
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
		
		JButton button = new JButton("Save");
		button.setBounds(500, 500, 100, 50);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Employee employee = new Employee();
				String id = txtFieldId.getText();
				String name = txtFieldName.getText();
				String salary = txtFieldSalary.getText();
				String address = txtArea.getText();
				employee.setName(name);
				employee.setAddress(address);
				//add values in employee object
				boolean result  = ValidationUtil.validateEmployeeInfo(employee);
				
				// true call save method from service class 
				
				JOptionPane.showMessageDialog(null, "Form submitted");

			}
		});
		
		frame.add(txtFieldId);
		frame.add(txtFieldName);
		frame.add(txtFieldSalary);
		frame.add(txtArea);
		frame.add(button);
		
		frame.setTitle("SWING");
		
		frame.setLayout(null);
		frame.setVisible(true);
	}
}

