package com.jdbc.laptop;

import com.jdbc.laptop.entity.LaptopEntity;
import java.util.List;


public interface LaptopDAO {
	
	List<LaptopEntity> readAllRecord();

	void saveLaptopRecord(LaptopEntity laptopEntity);

	void minOfLaptopDetails(int price);

	void maxOfLaptopDetails(int price);

	void avgOfLaptopDetails(int price);

	void sumOfLaptopDetails(int price);
     

	
	
	
	
	
	
	
//	void  updateBrand(LaptopEntity laptopEntity);
//
//	void updateBrandAndPrice(LaptopEntity laptopEntity);
//
//	void deletLaptopById(LaptopEntity laptopEntity);
//
//	void readSingleRecordById(LaptopEntity laptopEntity);
//
//	void readAllRecords(LaptopEntity laptopEntity);
//
//	void readLaptopPriceById(LaptopEntity laptopEntity);
//
//	void readLaptopBrandAndPriceById(LaptopEntity laptopEntity);
//
//	void readLaptopcolorByID(LaptopEntity laptopEntity);


}
