package com.vti.academy.maven.FinalExam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TestJDBC {
	public static void main(String[] args)
			throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {

		// get property
		Properties propertiesFile = new Properties();
		propertiesFile.load(new FileInputStream("src/main/resource/data.properties"));

		String url = propertiesFile.getProperty("connectionString");
		String user = propertiesFile.getProperty("username");
		String password = propertiesFile.getProperty("password");
		String driver = propertiesFile.getProperty("driverSQLName");

		Class.forName(driver);

		// B1: get a Database Connection
		Connection connection = DriverManager.getConnection(url, user, password);

		System.out.println("Successfully Connection!");

		
		connection.close();
	}
}
