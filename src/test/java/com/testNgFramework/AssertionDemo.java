package com.testNgFramework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	@Test
	public void Flipkart() throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//Assert.assertEquals(w.getTitle(),"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		SoftAssert soft =new SoftAssert();
		soft.assertEquals(w.getTitle(),"Onine Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
				
		w.quit();
		soft.assertAll();
	}

}
