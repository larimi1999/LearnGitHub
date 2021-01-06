package com.vti.finalexam.backend.businessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface IManagerService {
	public void createManager(String FirstName,String LastName, String Phone,String Email,int ExpInYear,String PassWord) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;
	public boolean login(String Email, String PassWord) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

}
