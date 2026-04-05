package com.PageObjectModule;

import java.util.List;

import javax.lang.model.element.Element;
import javax.xml.xpath.XPath;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class TerabeutyAddToCart {
	public TerabeutyAddToCart(WebDriver w) {
		PageFactory.initElements(w,this);
	}
	//webelements
	@FindBy(css ="input[id=\"search\"]")
	private WebElement Search;
	@FindBy(css="h3[id=\"cetaphil-gentle-skin-cleanser-1000ml-1044005\"]")
	private List<WebElement> products;
	@FindBy(xpath = "button[class=\"primary--SOMm7 undefined customBtn--MfL84 false  no-tap-highlight\"]")
	private WebElement addtobag;
	

	
	
	public void Search() {
		this.Search.sendKeys(products,Keys.ENTER);
	}
	public void product(String productname) {
		for (WebElement product : products) {
			if (product.getText().contains(productname)) {
				product.click();
			}
		}
	
	}public void addtobag() {
		addtobag.click();
	}
		
}
