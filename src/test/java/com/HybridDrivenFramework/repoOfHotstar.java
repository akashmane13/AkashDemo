package com.HybridDrivenFramework;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class repoOfHotstar {
	public repoOfHotstar(WebDriver w) {
		PageFactory.initElements(w, this);
	}
	@FindBy(xpath = "//*[@class=\"icon-search-line soul-icon NAV_ICON_FONT_SIZE\"]")
	private WebElement searchicon;
	@FindBy(id = "searchBar")
	private WebElement searchTextBox;
	@FindBy(xpath = "//*[@class=\"icon-close soul-icon text-white ICON_FONTSIZE_05\"]")
	private WebElement crossIconInSearchTextBox;
	@FindBy(xpath = "//*[@class=\"icon-user-fill soul-icon NAV_ICON_FONT_SIZE\"]")
	private WebElement mySpaceIcon;
	@FindBy(xpath = "//*[@data-testid=\"action\"]/button")
	private WebElement loginbtn;
	@FindBy(css = "//*[@title=\"Mobile number\"]")
	private WebElement mobNumberField;
	@FindBy(css = "button[data-testid=\"signup-form-submit-button\"]")
	private WebElement getOTP;
	
	public void searchIcon() {
		searchicon.click();
	}
	public void searchTextBox(String Search) {
		searchTextBox.sendKeys(Search);
	}
	public void searchCrossIcon() {
		crossIconInSearchTextBox.click();
	}
	public void myspace() {
		mySpaceIcon.click();
	}
	public void logInButton() {
		loginbtn.click();
	}
	public void getOTP() {
		getOTP.click();
	}

}
