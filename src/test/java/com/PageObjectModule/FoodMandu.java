package com.PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FoodMandu {

	public static void main(String[] args) {
	WebDriver w = new ChromeDriver();
	w.get("https://foodmandu.com/Home/Contact");
	FoodManduPOMwithPageFactory repo = new FoodManduPOMwithPageFactory(w);
	
	repo.login();
	repo.sendemail("xyz@gmail.com");
	repo.SendPassword("12345678");
	repo.loginbtn();
	
			
			

	}

}
