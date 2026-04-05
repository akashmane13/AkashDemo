package keywordDrivenFramework;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RepoOfDisha {
	public RepoOfDisha(WebDriver w) {
		PageFactory.initElements(w, this);
	}
	@FindBy(id="userName")
	private WebElement username;
	@FindBy(id= "password")
	private WebElement password;
	@FindBy(css="input[type=\"checkbox\"]")
	private WebElement KeepMeSignInCheckBox;
	@FindBy(id= "SignIn")
	private WebElement signin;
	@FindBy(css="a[data-toggle=\"tooltip\"]")
	private WebElement menu;
	@FindBy(css = "a[onclick=\"openRegistration()\"]")
	private WebElement registration;
	@FindBy(id = "prefix")
	private WebElement prefix;
	@FindBy (id = "fName")
	private WebElement firstName;
	@FindBy (id = "lName")
	private WebElement lastName;
	@FindBy(id="input[id=\"b2c\"]")
	private WebElement btoc;
	@FindBy(xpath = "//*[@id=\"s2id_patientTypeList\"]")
	private WebElement patientType;
	
	//Action
	public void username() {
		username.sendKeys("Suvarna");
	}
	public void password() {
		password.sendKeys("Suvarna@123");
	}
	public void keepmesignin() {
		KeepMeSignInCheckBox.click();
	}
	public void signin() {
		signin.click();
	}
	public void menu() {
		menu.click();
	}
	public void registration() {
		registration.click();
	}
	public void prefix() {
		Select sl =new Select(prefix);
		sl.selectByVisibleText("MR.");
	}
	public void firstname() {
		firstName.sendKeys("Akash");
	}
	public void lastname() {
		lastName.sendKeys("Mane");
	}
	public void btoc() {
		btoc.click();
	}
	public void closeBrowser() {
		closeBrowser();
	}
	

}
