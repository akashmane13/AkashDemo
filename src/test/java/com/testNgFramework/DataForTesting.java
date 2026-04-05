package com.testNgFramework;

import org.testng.annotations.DataProvider;

public class DataForTesting {
	@DataProvider(name="Ebay Amol ka wishlist")
	public String[] search() {
		String[] arr= {"mobile","Laptop","watches","Shoes","Sunglases","macbook","Projector"};
		return arr;
	}
	
	@DataProvider(name="My Wishlist")
	public String[][] data() {
		String[][] arr = new String[4][2];
		
		arr[0][0] ="Mobile";
		arr[0][1]="Mobile for sale | eBay";
		
		arr[1][0]="Projector";
		arr[1][1]="Projector for sale | eBay";
		
		arr[2][0]="Home Theater";
		arr[2][1]="Home Theater for sale | eBay";
		
		arr[3][0]="bulb";
		arr[3][1]="Bulb for sale | eBay";
		
		return arr;
		
		
	}

} 
