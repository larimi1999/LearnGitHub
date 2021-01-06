package com.vti.finalexam.backend.presiontationLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.finalexam.backend.businessLayer.EmployeeServiceImpl;
import com.vti.finalexam.backend.businessLayer.IEmployeeService;



public class EmployeeController {
	private IEmployeeService service;

	public EmployeeController() {
		service = new EmployeeServiceImpl();
	}

	public void createEmployee(String FirstName, String LastName, String Phone, String Email, String projectName,String ProSkill,
			String PassWord) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		service.createEmployee(FirstName, LastName, Phone, Email, projectName,ProSkill, PassWord);
	}

	public boolean login1(String Email, String PassWord)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return service.login1(Email, PassWord);
	}
}
