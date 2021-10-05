package com.jdbc.laptop;
import java.sql.*;

public class Laptop {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="pooja@1215"; 
		

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	DriverManager.getConnection(url, userName, password);
	System.out.println("connection is successful " +url);
	
} 
	catch (SQLException sqlException) {
	System.out.println(sqlException.getMessage());
} 
	catch (ClassNotFoundException classNotFoundException) {
		classNotFoundException.printStackTrace();
		//System.out.println(classNotFoundException.getMessage());
}
	


	
	
	}
}
