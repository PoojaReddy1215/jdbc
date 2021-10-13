package com.laptop.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LaptopDAOImpl implements LaptopDAO {

	public void saveLaptopRecords(int id, String name, int price, String processor, int storage) {

		String insertQuery = "INSERT INTO details_laptop value (?,?,?,?,?)";
		// parse the query
		try {
			Connection connection = ConnectionProvider.getconnection();
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, price);
			preparedStatement.setString(4, processor);
			preparedStatement.setInt(5, storage);
			preparedStatement.executeUpdate();
			// set the value
			System.out.println("first row is inserted");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			classNotFoundException.printStackTrace();

		}
	}

	public void updatenameOfLaptop(String name) {
		String updatenameOfLaptop = "UPDATE details_laptop set name = ? where id = 1";

		try {

			Connection connection = ConnectionProvider.getconnection();
			PreparedStatement preparedStatement = connection.prepareStatement(updatenameOfLaptop);
			preparedStatement.setString(1, name);
			preparedStatement.executeUpdate();
			System.out.println("UPDATE details_laptop set name = MacBook where id = 1");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			classNotFoundException.printStackTrace();

		}
	}

	public void deletLaptopDetailsById(int id) {

		String deletLaptopDetailsById = "delete FROM details_laptop where id =?";
		try {

			Connection connection = ConnectionProvider.getconnection();
			PreparedStatement preparedStatement = connection.prepareStatement(deletLaptopDetailsById);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			System.out.println("invoked delete FROM details_laptop where id =?");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			classNotFoundException.printStackTrace();
		}
	}

	public void updateBrandAndPrice(String name, int price) {

		String updateBrandAndPrice = "UPDATE details_laptop SET name=?,price=? WHERE id=1";
		try {

			Connection connection = ConnectionProvider.getconnection();
			PreparedStatement preparedStatement = connection.prepareStatement(updateBrandAndPrice);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, price);
			preparedStatement.executeUpdate();
			System.out.println("invoked UPDATE details_laptop SET name=?,price=? WHERE id=1\"");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			classNotFoundException.printStackTrace();
		}
	}

	public void readSingleRecordById(int id) {

	String readSingleRowByID = "SELECT *FROM laptop_details WHERE ID=?";

		try {

			Connection connection = ConnectionProvider.getconnection();
			PreparedStatement preparedStatement = connection.prepareStatement(readSingleRowByID);
			preparedStatement.setInt(1, id);
			preparedStatement.executeQuery();
			System.out.println("invoked SELECT *FROM laptop_details WHERE ID=?");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			classNotFoundException.printStackTrace();
		}

	}

	public void readLaptopPriceById(int id) {

		String readLaptopPriceByID = "SELECT price FROM laptop_details WHERE ID=?";
		try {

			Connection connection = ConnectionProvider.getconnection();
			PreparedStatement preparedStatement = connection.prepareStatement(readLaptopPriceByID);
			preparedStatement.setInt(1, id);
			preparedStatement.executeQuery();
			System.out.println("invoked SELECT price FROM laptop_details WHERE ID=?");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			classNotFoundException.printStackTrace();
		}
	}

	public void readLaptopNameById(int id) {

		String readLaptopBrandByID = "SELECT name FROM laptop_details WHERE ID=?";

		try {

			Connection connection = ConnectionProvider.getconnection();
			PreparedStatement preparedStatement = connection.prepareStatement(readLaptopBrandByID);
			preparedStatement.setInt(1, id);
			preparedStatement.executeQuery();
			System.out.println("invoked delete FROM details_laptop where id =?");

		} catch (Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			classNotFoundException.printStackTrace();

		}

	}
}
