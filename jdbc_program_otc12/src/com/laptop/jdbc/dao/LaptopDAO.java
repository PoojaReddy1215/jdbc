package com.laptop.jdbc.dao;

public interface LaptopDAO {

	void saveLaptopRecords(int id, String name, int price, String processor, int storage);

	void updatenameOfLaptop(String name);

	void deletLaptopDetailsById(int id);

	void updateBrandAndPrice(String name, int price);

	void readSingleRecordById(int id);

	void readLaptopPriceById(int id);

	void readLaptopNameById(int id);
	
}
