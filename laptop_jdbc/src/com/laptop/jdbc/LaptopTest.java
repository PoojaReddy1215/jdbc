package com.laptop.jdbc;

import com.laptop.jdbc.dao.LaptopDAO;
import com.laptop.jdbc.dao.LaptopDAOImpl;

public class LaptopTest {

	public static void main(String[] args) {
		

		LaptopDAO laptopDAO = new LaptopDAOImpl();
		
		laptopDAO.saveLaptopRecords();
		laptopDAO.updatenameOfLaptop();
		laptopDAO.deletLaptopDetailsById();
		laptopDAO.readAllRecords();
	}
}
