package com.DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;
import net.bytebuddy.implementation.ToStringMethod;

public class FlipcartSearch {

	public static void main(String[] args) throws FileNotFoundException, Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		FileInputStream fis= new FileInputStream("C:\\Users\\akama\\Downloads\\Book2.xlsx");
		XSSFWorkbook Work = new XSSFWorkbook(fis);
		XSSFSheet sheet = Work.getSheet("Sheet1");
		for (int i=1;i<=sheet.getLastRowNum();i++) 
		{
			XSSFRow row= sheet.getRow(i);
			XSSFCell testdata=row.getCell(2);
			String Searchs[]= testdata.toString().split(",");
			
			for(String search:Searchs) 
			{
				w.findElement(By.name("q")).sendKeys(search,Keys.ENTER);
				Thread.sleep(3000);
				w.findElement(By.name("q")).sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
				Thread.sleep(3000);

			}
		}
	}

}
