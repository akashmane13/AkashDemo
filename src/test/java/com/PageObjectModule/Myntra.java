package com.PageObjectModule; 

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) {
		WebDriver w = new ChromeDriver();
		w.get("https://www.myntra.com/");
		w.manage().window().maximize();
		MyntraPOMadd repo= new MyntraPOMadd(w);
		String main =w.getWindowHandle();
		Set<String> mainandchild = w.getWindowHandles();
		for (String mac : mainandchild) {
			if (!mac.equals(main)) {
				w.switchTo().window(mac);
			}
		}
	
		
		
		repo.Search("shirt");
		repo.product();
		repo.addtobab();
	}

}
