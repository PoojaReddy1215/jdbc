package com.JDBC.close;
import java.sql.*;

public class LaptopClose {

public static void main(String[] args) throws SQLException {
			String url = "jdbc:mysql://localhost:3306/Laptop";
			String userName ="root"; 
			String password ="pooja@1215"; 
			String readAllRecords = "select * from laptop_details;";
		    Connection connection = null;
		    
			try {
				//Class.forName("com.mysql.cj.jdbc.Driver");
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
				/*resultSet.next();
				System.out.println("Laptop_id"+resultSet.getInt(1));
				System.out.println("Name"+resultSet.getString(2));
				System.out.println("Price"+resultSet.getString(3));
				System.out.println("Processor"+resultSet.getString(4));
				System.out.println("Storage"+resultSet.getInt(5));
				
				resultSet.next();
				System.out.println("Laptop_id"+resultSet.getInt(1));
				System.out.println("Name"+resultSet.getString(2));
				System.out.println("Price"+resultSet.getString(3));
				System.out.println("Processor"+resultSet.getString(4));
				System.out.println("Storage"+resultSet.getInt(5));*/
				} catch (SQLException sqlException) {
				  System.out.println(sqlException.getMessage());
				  sqlException.printStackTrace();
			    } catch (Exception classNotFoundException) {
					System.out.println(classNotFoundException.getMessage());
			
			    }   finally {
				    if(connection != null) {
					connection.close();
					System.out.println("connection is closed");
					}
				    else {
					System.out.println("connection is not closed");
				}
			}
 }

}
