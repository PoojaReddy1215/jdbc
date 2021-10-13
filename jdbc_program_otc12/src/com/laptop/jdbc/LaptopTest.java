package com.laptop.jdbc;

import com.laptop.jdbc.dao.LaptopDAOImpl;

public class LaptopTest {

	public static void main(String[] args) {

		LaptopDAOImpl laptopDAO = new LaptopDAOImpl();

		laptopDAO.saveLaptopRecords(1, "HP", 55000, "Intel Core-i5", 500);
		laptopDAO.updatenameOfLaptop("MacBook");
		laptopDAO.deletLaptopDetailsById(1);  
		laptopDAO.updateBrandAndPrice("DELL", 56500);
		laptopDAO.readSingleRecordById(3);
		laptopDAO.readLaptopPriceById(4);
		laptopDAO.readLaptopNameById(2);

	}
}
