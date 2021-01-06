package com.vti.finalexam.backend.presiontationLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.finalexam.backend.businessLayer.IManagerService;
import com.vti.finalexam.backend.businessLayer.ManagerServiceImpl;

public class ManagerController {
	private IManagerService service;
	
	public  ManagerController(){
		service = new ManagerServiceImpl();
	}

	public void createManager(String FirstName, String LastName, String Phone, String Email,int ExpInYear, String PassWord ) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		service.createManager(FirstName, LastName, Phone, Email, ExpInYear, PassWord);
	}
	
	
	
	public boolean login(String Email, String PassWord) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		 return service.login(Email, PassWord);
			
	}

}
