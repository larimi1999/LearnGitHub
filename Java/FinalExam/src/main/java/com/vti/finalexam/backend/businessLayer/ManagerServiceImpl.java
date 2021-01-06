package com.vti.finalexam.backend.businessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.finalexam.backend.dataLayer.ManagerRepository;

public class ManagerServiceImpl implements IManagerService{
	private ManagerRepository repository;
	
	

	public ManagerServiceImpl(){
		repository = new ManagerRepository();
	}



	public void createManager(String FirstName, String LastName, String Phone, String Email, int ExpInYear,
			String PassWord) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		repository.createManager(FirstName, LastName, Phone, Email, ExpInYear, PassWord);
	}
	
	public boolean login(String Email, String PassWord) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		 return repository.login(Email, PassWord);
				
	}

	
	
	
	


}
