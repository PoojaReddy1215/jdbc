package com.laptop;
import java.sql.*;

import com.laptop.dao.LaptopDAOImpl;
public class LaptopTest {

	public static void main(String[] args) throws SQLException {
		
		LaptopDAOImpl laptopDAO = new LaptopDAOImpl();
		laptopDAO.saveLaptopRecords();
		laptopDAO.updatenameOfLaptop();
		laptopDAO.deletLaptopDetailsById();
		laptopDAO.readAllRecords();
	}
}
		