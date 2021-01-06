package com.vti.finalexam.backend.businessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface IEmployeeService   {
	public void 	createEmployee(String FirstName,String LastName, String Phone,String Email,String projectName,String ProSkill,String PassWord) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	public boolean login1(String Email, String PassWord) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

}
