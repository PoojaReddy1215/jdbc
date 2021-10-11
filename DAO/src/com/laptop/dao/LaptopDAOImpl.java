package com.laptop.dao;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
public class LaptopDAOImpl implements LaptopDAO {

	public void saveLaptopRecords() {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="pooja@1215";
		Connection connection = null;
		
		String insertQuery1 = "INSERT INTO details_laptop value (1,'HP',55000,'Intel Core-i5',500)";
		String insertQuery2 = "INSERT INTO details_laptop value (2,'Dell',40000,'Intel Core-i3',500)";
		String insertQuery3 = "INSERT INTO details_laptop value (3,'Acer',30000,'Intel Core-i3',800)";
		String insertQuery4 = "INSERT INTO details_laptop value (4,'ACER',65000,'CORE I5',500)";
		
         try {

        	connection = DriverManager.getConnection(url, userName, password);
            System.out.println("connection is successful " +url);
            Statement statement = connection.createStatement(); //to put sql query to java

			statement.executeUpdate(insertQuery1);
			System.out.println("first row is inserted");

			statement.executeUpdate(insertQuery2);
			System.out.println("second row is inserted");

			statement.executeUpdate(insertQuery3);
			System.out.println("third row is inserted");

			statement.executeUpdate(insertQuery4);
			System.out.println("four row is inserted");

		} catch (SQLException sqlException) {
		  System.out.println(sqlException.getMessage());
          //sqlException.printStackTrace();
		  
		} catch (Exception classNotFoundException) {
		  System.out.println(classNotFoundException.getMessage());
          //classNotFoundException.printStackTrace();	}
         }

         finally {
 			try {
 				if(connection != null) {
 					connection.close();
 					System.out.println("connection closed");
 					System.out.println("********************");
 				}
 				else {
 					System.out.println("connection is not closed");
 				}
 			}catch (SQLException e) {
 				e.printStackTrace();
 			}
 		}
 	}

	
	public void updatenameOfLaptop() {
		
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="pooja@1215";
		Connection connection = null;
		
		String updatenameOfLaptop = "UPDATE details_laptop set name= 'MaCBook' where id = 1";
		  
		try {
            connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);
			
			Statement statement = connection.createStatement(); //to put sql query to java
			statement.executeUpdate(updatenameOfLaptop);
			System.out.println("updatenameOfLaptop 1th row");
			
		} catch (SQLException sqlException) {
			  System.out.println(sqlException.getMessage());
	          //sqlException.printStackTrace();
			  
		} catch (Exception classNotFoundException) {
			  System.out.println(classNotFoundException.getMessage());
	          //classNotFoundException.printStackTrace();	}
	         }

	         finally {
	 			try {
	 				if(connection != null) {
	 					connection.close();
	 					System.out.println("connection closed");
	 					System.out.println("********************");
	 				}
	 				else {
	 					System.out.println("connection is not closed");
	 				}
	 			    }
	 			    catch (SQLException e) {
	 				e.printStackTrace();
	 			}
	 		}
	 	}


	public void deletLaptopDetailsById() {
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="pooja@1215";
		Connection connection = null;
		
		String deletLaptopDetailsById = "delete FROM details_laptop where id =1";
		
		try {
            connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is successful " +url);
			
			Statement statement = connection.createStatement(); //to put sql query to java
			statement.executeUpdate(deletLaptopDetailsById);
			System.out.println("deletLaptopDetailsById 1th row");
			
		} catch (SQLException sqlException) {
			  System.out.println(sqlException.getMessage());
	          //sqlException.printStackTrace();
			  
		} catch (Exception classNotFoundException) {
			  System.out.println(classNotFoundException.getMessage());
	          //classNotFoundException.printStackTrace();	}
	         }

	         finally {
	 			try {
	 				if(connection != null) {
	 					connection.close();
	 					System.out.println("connection closed");
	 					System.out.println("********************");
	 				}
	 				else {
	 					System.out.println("connection is not closed");
	 				}
	 			    }
	 			    catch (SQLException e) {
	 				e.printStackTrace();
	 			}
	 		}
	}

		public void readAllRecords() {
			
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName ="root"; 
		String password ="pooja@1215";
		Connection connection = null;
		
		String readAllRecords = "select * from details_laptop";
		
		try {
			connection = DriverManager.getConnection(url, userName, password); 
			System.out.println("connection is successful " +url);
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(readAllRecords);
			    while(resultSet.next()) {
				System.out.println("id" + resultSet.getInt(1));
				System.out.println("Name" + resultSet.getString(2));
				System.out.println("Price" + resultSet.getInt(3));
				System.out.println("Processor" + resultSet.getString(4));
				System.out.println("Storage" + resultSet.getInt(5));
				}
		        
		        } catch (SQLException sqlException) {
					System.out.println(sqlException.getMessage());
					
				} catch (Exception classNotFoundException) {

					System.out.println(classNotFoundException.getMessage());

				}

		finally {
 			try {
 				if(connection != null) {
 					connection.close();
 					System.out.println("connection closed");
 					System.out.println("********************");
 				}
 				else {
 					System.out.println("connection is not closed");
 				}
 			    }
 			    catch (SQLException e) {
 				e.printStackTrace();
 			}
 		}
    }
}
		
		
		
		

	

