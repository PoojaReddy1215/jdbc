package com.laptop.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LaptopDAOImpl implements LaptopDAO {

      public void saveLaptopRecords() {

		String insertQuery1 = "INSERT INTO details_laptop value (1,'HP',55000,'Intel Core-i5',500)";
		String insertQuery2 = "INSERT INTO details_laptop value (2,'Dell',40000,'Intel Core-i3',500)";
		String insertQuery3 = "INSERT INTO details_laptop value (3,'Acer',30000,'Intel Core-i3',800)";
		String insertQuery4 = "INSERT INTO details_laptop value (4,'ACER',65000,'CORE I5',500)";
		
		
		try {
	
		   Connection connection = LaptopProvider.getconnection();
		   Statement statement = connection.createStatement();
			
		   statement.executeUpdate(insertQuery1);
		   System.out.println("first row is inserted");

		   statement.executeUpdate(insertQuery2);
		   System.out.println("second row is inserted");

		   statement.executeUpdate(insertQuery3);
		   System.out.println("third row is inserted");

		   statement.executeUpdate(insertQuery4);
		   System.out.println("four row is inserted");
		   
		
	} catch (Exception classNotFoundException) {
      System.out.println(classNotFoundException.getMessage());
      classNotFoundException.printStackTrace();	
      }
		
	}


	public void updatenameOfLaptop() {
		
	String updatenameOfLaptop = "UPDATE details_laptop set name= 'MaCBook' where id = 1";	
	
	try {
		
		   Connection connection = LaptopProvider.getconnection();
		   Statement statement = connection.createStatement();
		   statement.executeUpdate(updatenameOfLaptop);
		   
	} catch (Exception classNotFoundException) {
	      System.out.println(classNotFoundException.getMessage());
	      classNotFoundException.printStackTrace();	
	      }
}

	
	public void deletLaptopDetailsById() {
		
	String deletLaptopDetailsById = "delete FROM details_laptop where id =1";
		
	try {
			
       Connection connection = LaptopProvider.getconnection();
	   Statement statement = connection.createStatement();
	   statement.executeUpdate(deletLaptopDetailsById);
			   
	} catch (Exception classNotFoundException) {
	      System.out.println(classNotFoundException.getMessage());
	      classNotFoundException.printStackTrace();	
	      }	
	}

	
	public void readAllRecords() {
	
    String readAllRecords = "select * from details_laptop";
		
	try {
		
		Connection connection = LaptopProvider.getconnection();
	    Statement statement = connection.createStatement();
	    statement.executeQuery(readAllRecords);
	    
	    ResultSet resultSet = statement.executeQuery(readAllRecords);
	    while(resultSet.next()) {
		System.out.println("id" + resultSet.getInt(1));
		System.out.println("Name" + resultSet.getString(2));
		System.out.println("Price" + resultSet.getInt(3));
		System.out.println("Processor" + resultSet.getString(4));
		System.out.println("Storage" + resultSet.getInt(5));
		}
	    connection.close();
	    
		
	} catch (Exception classNotFoundException) {
	      System.out.println(classNotFoundException.getMessage());
	      classNotFoundException.printStackTrace();	
	      
	      }	
	
	}

	



	
		
	}



