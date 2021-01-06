package com.vti.finalexam.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.vti.finalexam.backend.presiontationLayer.EmployeeController;
import com.vti.finalexam.backend.presiontationLayer.ManagerController;
import com.vti.finalexam.utils.ScannerUtils;


public class Function {
	private ManagerController controller;
	private Scanner scanner;
	private ScannerUtils scannerUtils;
	private EmployeeController controller1;
	
	
	
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: Ngo Trung Nhat
	 * @create_date: Mar 24, 2020
	 * @version: 1.0
	 * @modifer: Ngo Trung nhat
	 * @modifer_date: Mar 24, 2020
	 * @param userName
	 */
	public Function() {
		controller = new ManagerController();
		scanner = new Scanner(System.in);
		controller1= new EmployeeController();
		
	}
	
	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: Ngo Trung Nhat
	 * @create_date: Mar 24, 2020
	 * @version: 1.0
	 * @modifer: hung34atp
	 * @modifer_date: Mar 24, 2020
	 * @param userName
	 */

	public void createManager() {
		try {
			System.out.println("Please input FirstName;");
			String FirstName = ScannerUtils.readString(scanner,"");

			System.out.println("Please input LastName");
			String LastName = ScannerUtils.readString(scanner,"");

			System.out.println("Please input Phone;");
			String Phone = ScannerUtils.readString(scanner,"");

			System.out.println("Please input Email;");
			String Email = ScannerUtils.readString(scanner,"");
			
			System.out.println("Please input ExpInYear;");
			int ExpInYear = ScannerUtils.readInt(scanner,"");
			
			System.out.println("Please input PassWord;");
			String PassWord = ScannerUtils.readString(scanner,"");

			controller.createManager(FirstName, LastName, Phone, Email, ExpInYear, PassWord);
			System.out.println("create Successfully");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("There is a error occur!");
		}
	}
	
	public void login() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{

		try {
			

			System.out.println("Please input Email:");
		    String Email = ScannerUtils.readString(scanner,"");			
			
			System.out.println("Please input PassWord:");
			String PassWord = ScannerUtils.readString(scanner,"");

			
			boolean b=controller.login(Email, PassWord);	
			if(b==true)
			{
				System.out.println("Dang nhap thanh cong");
			}
			if(b==false)
			{
				System.out.println("Dang nhap that bai");
			}
			

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("There is a error occur!");
		}
		
		
	}
	
	public void createEmployee() {
		try {
			System.out.println("Please input FirstName;");
			String FirstName = ScannerUtils.readString(scanner,"");

			System.out.println("Please input LastName");
			String LastName = ScannerUtils.readString(scanner,"");

			System.out.println("Please input Phone;");
			String Phone = ScannerUtils.readString(scanner,"");

			System.out.println("Please input Email;");
			String Email = ScannerUtils.readString(scanner,"");
			
			
			System.out.println("Please input projectName;");
			String projectName = ScannerUtils.readString(scanner,"");
		
			
			System.out.println("Please input ProSkill;");
			String ProSkill = ScannerUtils.readString(scanner,"");
			
			
			System.out.println("Please input PassWord;");
			String PassWord = ScannerUtils.readString(scanner,"");

			controller1.createEmployee(FirstName, LastName, Phone, Email, projectName,ProSkill, PassWord);
			System.out.println("create Successfully");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("There is a error occur!");
		}
	}
	
	public void login1() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{

		try {
			

			System.out.println("Please input Email:");
		    String Email = ScannerUtils.readString(scanner,"");			
			
			System.out.println("Please input PassWord:");
			String PassWord = ScannerUtils.readString(scanner,"");

			
			boolean b=controller1.login1(Email, PassWord);	
			if(b==true)
			{
				System.out.println("Dang nhap thanh cong");
			}
			if(b==false)
			{
				System.out.println("Dang nhap that bai");
			}
			

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("There is a error occur!");
		}
		
		
	}
	
}
