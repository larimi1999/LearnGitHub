package com.vti.finalexam.backend.dataLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class EmployeeRepository {
	private Connection getDatabaseConnection() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
		// get property
		Properties propertiesFile = new Properties();
		propertiesFile.load(new FileInputStream("src/main/resource/data.properties"));

		String url 		= propertiesFile.getProperty("connectionString");
		String user 	= propertiesFile.getProperty("username");
		String password = propertiesFile.getProperty("password");
		String driver	= propertiesFile.getProperty("driverSQLName");

		Class.forName(driver);

		// B1: get a Database Connection
		return DriverManager.getConnection(url, user, password);

		
	}
	public void createEmployee(String FirstName,String LastName, String Phone,String Email,String projectName,String ProSkill,String PassWord) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		
				/*
				 * @see com.vti.jdbc.backend.datalayer.
				 */
				//B1 : get a Database Connection
				Connection connection = getDatabaseConnection();
				
		
		
				// B2: write statement
				String sqlStatement = "INSERT INTO Employee(`FirstName`, `LastName`, `Phone`,`Email`,`projectName`,`ProSkill`,`PassWord`) "+
									  "VALUES 				(	?, 			?,		   ?,		?,			? ,			?,		?)";
				
				PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);

				// set parameter
				preparedStatement.setString(1, 	FirstName);
				preparedStatement.setString(2,	LastName);
				preparedStatement.setString(3, 	Phone);
				preparedStatement.setString(4,  Email);
				preparedStatement.setString(5,  projectName);
				preparedStatement.setString(6,  ProSkill);			
				preparedStatement.setString(7,  PassWord);
				
				

				// execute Query Update
				preparedStatement.executeUpdate();
				

				// close connection
				connection.close();
	}
	
	public boolean login1(String Email, String PassWord) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		Connection connection = getDatabaseConnection();
		/*
		 * @see com.vti.jdbc.backend.datalayer.
		 */
		//B1 : get a Database Connection
		
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int dem = 0;
		try {
			pstmt = connection.prepareStatement("select 1 from Employee where Email=? and PassWord=?");
			pstmt.setString(1, Email);
			pstmt.setString(2, PassWord);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dem++;
			}
			if (dem == 1) {
				return true;
			}else {
				return false;
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			EmployeeRepository.closeAll(connection, pstmt, rs);
		}
		return false;
	}
		
	public static void closeAll(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if (con != null)
			try {
				con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
	}

}
