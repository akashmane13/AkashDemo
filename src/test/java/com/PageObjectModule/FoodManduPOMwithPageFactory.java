package com.PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodManduPOMwithPageFactory {
	public FoodManduPOMwithPageFactory(WebDriver w) {
		PageFactory.initElements(w, this);
	}
	// Webelemnt
	//object variable or class variable
	@FindBy(css = "button[class=\"btn btn--hollow hidden-sm-down\"]")
	private WebElement login;
	@FindBy(css = "input[name=\"Email\"]")
	private WebElement email;
	@FindBy(name = "Password")
	private WebElement password;
	
	//datatype varible = value
	//@annnotation[findelemnt (findby)] (Value)
	// datatype variable
	@FindBy(css ="button[type=\"submit\"]")
	private WebElement loginbtn; //private list<WebElement> loginbtn for multiple elemnts
	
	//set of action
	public void login() {
		login.click();
	}
	public void sendemail(String email) {
		this.email.sendKeys(email);
	}
	public void clearEmail() {
		email.clear();
	}
	public void SendPassword(String password) {
		this.password.sendKeys(password);
	}
	public void ClearPassword() {
		password.clear();
	}
	public void loginbtn() {
		loginbtn.click();
	}

}
