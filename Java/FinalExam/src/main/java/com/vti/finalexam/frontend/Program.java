package com.vti.finalexam.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException  {
		Function f = new Function();
		
		Scanner sc = new Scanner(System.in);
	
		while(true)
		{
			System.out.println("Plase input your Choose :");
			System.out.println("1.Insert Manager.");
			System.out.println("2.Insert Employee.");
			System.out.println("3.Login use Manager Account.");
			System.out.println("4.Login use Employee Account.");
			System.out.println("5.Exit");
			int choose = sc.nextInt();
			if(choose==1)
			{
				f.createManager();
			}
			
			if(choose==2)
			{
				f.createEmployee();
			}
			if(choose==3)
			{
				f.login();
				break;
			}
			if(choose==4)
			{
				f.login1();
				break;
			}
			if(choose==5)
			{
				System.exit(0);
			}
		}
	
	}
}
