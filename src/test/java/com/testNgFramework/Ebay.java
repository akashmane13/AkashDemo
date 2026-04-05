package com.testNgFramework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ebay {
	RemoteWebDriver w;
	//WebDriver w;
	@BeforeMethod
	public void lanchAndNavigateToEbaySite() throws Exception {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("chrome");
		//w= new ChromeDriver();
		w=new RemoteWebDriver(dc);
		w.get("https://www.ebay.com/");
		Thread.sleep(2000);
	}
	@Test(dataProviderClass = DataForTesting.class,dataProvider = "My Wishlist")
	
	public void searchAnProduct(String search ,String expectedTitle) throws Exception {
		Thread.sleep(2000);
		w.findElement(By.id("gh-ac")).sendKeys(search,Keys.ENTER);
		Thread.sleep(2000);
		assertEquals(w.getTitle(), expectedTitle);
	}
	@AfterMethod
	public void CloseAnBrowser() throws Exception {
		Thread.sleep(2000);
		w.quit();
	}

}
