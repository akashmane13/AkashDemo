package com.testNgFramework;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Nykaa {
	ThreadLocal<WebDriver> w;
	@Parameters("bs")
	@BeforeMethod
	public void launchAnBrowser (String browser) {
		if (browser.equals("Chrome")) {
			w=new ThreadLocal<WebDriver>();
			w.set(new ChromeDriver());		
		}else if (browser.equals("firefox")) {
			w=new ThreadLocal<WebDriver>();
			w.set(new FirefoxDriver());
		}else if (browser.equals("edge")) {
			w=new ThreadLocal<WebDriver>();
			w.set(new EdgeDriver());
		}
		w.get().manage().window().maximize();
		w.get().get("https://www.nykaa.com/");
	}
	@Test
	public void Search() throws Exception {
		Thread.sleep(2000);
		w.get().findElement(By.name("search-suggestions-nykaa")).sendKeys("shoes",Keys.ENTER);
		Thread.sleep(2000);
		Assert.assertEquals(w.get().getCurrentUrl(),"https://www.nykaa.com/search/result/?q=shoes&root=search&searchType=Manual&sourcepage=home");
		
	}
	@Test
	public void category() throws Exception {
		Thread.sleep(2000);
		w.get().findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[9]/a")).click();
		String main=w.get().getWindowHandle();
		Set<String>multi= w.get().getWindowHandles();
		for (String m : multi) {
			if (!m.equals(main)) {
				w.get().switchTo().window(m);
			}
			
		}
		SoftAssert soft = new SoftAssert();
		Thread.sleep(2000);
		soft.assertEquals(w.get().getTitle(),"Men's Store");
		Thread.sleep(2000);
		w.get().close();
		w.get().switchTo().window(main);
		soft.assertAll();
	}
	@Test
	public void bag() throws Exception {
		w.get().findElement(By.id("header-bag-icon")).click();
		Thread.sleep(2000);
		Assert.assertEquals(w.get().findElement(By.cssSelector("span[data-test-id=\"header-title\"]")).getText(),"Bag");
	}
	@AfterMethod
	public void CloseBrowser() {
		w.get().quit();
	}

}
