package com.jdbcConnection;
import java.sql.*;
public class LaptopConnection {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="pooja@1215"; 
		
		String insertQuery = "INSERT INTO Details_laptop value ('Dell',40000,'Intel Core-i3',600)";
		String insertQuery1 = "INSERT INTO Details_laptop value ('Acer',30000,'Intel Core-i3',800)";
		String insertQuery2 = "INSERT INTO Details_laptop value ('HP',55000,'Intel Core-i5',500)";
		String insertQuery3 = "INSERT INTO Details_laptop value ('Lenovo',65000,'Intel Core-i7',24)";
		String updateQuery = "update Details_laptop set name = mac where id = 1";
		
		try {
			Connection connection = DriverManager.getConnection(url, userName, password); 
			System.out.println("connection is successful " +url);
			Statement statement = connection.createStatement();
			statement.executeUpdate(insertQuery);
			statement.executeUpdate(insertQuery1);
			statement.executeUpdate(insertQuery2);
			statement.executeUpdate(insertQuery3);
			statement.executeUpdate(updateQuery);
			System.out.println("laptop is declared");
		} 
		catch (SQLException sqlException) {
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		} 
			catch (Exception classNotFoundException) {
				System.out.println(classNotFoundException.getMessage());
		}
			


	}			

}
