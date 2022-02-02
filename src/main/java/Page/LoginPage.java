package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WaitUtility;

public class LoginPage {

	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//span[@class='fa fa-check']")
	private WebElement rem;

	@FindBy(xpath = "//a[@class='text-muted']")
	private WebElement forgot;

	@FindBy(xpath = "//input[@name='email_or_username']")
	private WebElement usname;

	@FindBy(xpath = "//button[@name='flag']")
	private WebElement sub;
	
	@FindBy(xpath = "//div[@class='alert alert-danger']")
	private WebElement alertMessageField;
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void set(String n, String s) {

		username.sendKeys(n); 
		password.sendKeys(s);
		submit.click();

	}

	public boolean rememberMe() {
		rem.click();
		boolean a = rem.isSelected();
		return a;

	}
	public boolean invalidCredentials() {
		boolean alert=alertMessageField.isDisplayed();
		return alert;
	}
	public String forgotPassword() {
		WaitUtility.waitForElementToBeClickable(driver, forgot, 100);
		forgot.click();
		usname.sendKeys("admin");
		return driver.getCurrentUrl();
	}
	

	public void resetPassword1() {
		WaitUtility.waitForElementToBeClickable(driver, forgot, 100);
		forgot.click();
		usname.sendKeys("nibinjiju");
		sub.click();

	}
	
}
