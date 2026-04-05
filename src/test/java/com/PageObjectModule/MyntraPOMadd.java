package com.PageObjectModule;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPOMadd {
	public MyntraPOMadd (WebDriver w) {
		PageFactory.initElements(w, this);
		
	}
	@FindBy(css ="input[class=\"desktop-searchBar\"]")
	private WebElement search;
	@FindBy(xpath = "//*[@href=\"shirts/ad+by+arvind/ad-by-arvind-men-classic-slim-fit-textured-spread-collar-cotton-casual-shirt/33747535/buy\"]")
	private WebElement product;
	@FindBy(xpath = "//*[@class=\"myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center \"]")
	private WebElement addtobag;

	

	
	
	public void Search(String search) {
		this.search.sendKeys(search,Keys.ENTER);
	}
	public void product() {
		product.click();
	}
	public void addtobab() {
		addtobag.click();
	}
}
