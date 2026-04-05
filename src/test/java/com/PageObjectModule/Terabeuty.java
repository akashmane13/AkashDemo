package com.PageObjectModule;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Terabeuty {

	public static void main(String[] args) {
		WebDriver w = new ChromeDriver();
		w.get("https://www.tirabeauty.com/?srsltid=AfmBOopqBneRa8jpvMRO9v-1L9K4ZujUy6aX_es3-XLdG0-Acysf1MuQ");
		TerabeutyAddToCart repo=new TerabeutyAddToCart(w);
		
		repo.Search("Citaphil");
		Thread.sleep(3000);
		repo.product("");
		String main =w.getWindowHandle();
		Set<String> mainandChild = w.getWindowHandles();
		for(String mac : mainandChild) {
			if (!mac.equals(main)) {
				w.switchTo().window(mac);
				
			}
		}
		Thread.sleep(3000);
		repo.addtobag();
				
				

	}

}
