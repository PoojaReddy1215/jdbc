package com.jdbc.laptoptest;

import java.util.List;
import com.jdbc.laptop.LaptopDAO;
import com.jdbc.laptop.LaptopDAOImpl;
import com.jdbc.laptop.entity.LaptopEntity;


public class LaptopTest {

	public static void main(String[] args) {

		LaptopDAOImpl laptopdao = new LaptopDAOImpl(); 
		List<LaptopEntity> allrecords = laptopdao.readAllRecord();
		for (LaptopEntity laptopEntity : allrecords) {
			System.out.println(laptopEntity + "/t");
			System.out.println();
			System.out.println("-----------------------------");
			}
		
		
		LaptopEntity laptopEntity = new LaptopEntity(2,"Dell","Gray",50000,"Intel Core-i3",7,120,false,true);
			laptopdao.saveLaptopRecord(laptopEntity);
			    System.out.println(laptopEntity);
				System.out.println("---------------------");
		
				laptopdao.minOfLaptopDetails(50000);
				laptopdao.maxOfLaptopDetails(650000);
				laptopdao.avgOfLaptopDetails(250000);
				laptopdao.sumOfLaptopDetails(550000);
				
				
				
				
	}
}
