package com.vti.finalexam.backend.businessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.finalexam.backend.dataLayer.EmployeeRepository;


public class EmployeeServiceImpl implements IEmployeeService {
	private EmployeeRepository repository;

	public EmployeeServiceImpl() {
		repository = new EmployeeRepository();
	}

	public void createEmployee(String FirstName, String LastName, String Phone, String Email, String projectName,String ProSkill,
			String PassWord) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		repository.createEmployee(FirstName, LastName, Phone, Email, projectName,ProSkill, PassWord);
	}

	public boolean login1(String Email, String PassWord)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return repository.login1(Email, PassWord);
	}

	
}
