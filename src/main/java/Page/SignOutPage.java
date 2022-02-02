package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WaitUtility;

public class SignOutPage {
	
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//img[@class='img-xs user-image']")
	private WebElement img;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signout;

	private WebDriver driver;

	
	public SignOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void login() {
		username.sendKeys("admin");
		password.sendKeys("123456");
		submit.click();
	}
	public void logout() {
		WaitUtility.waitImplicit(driver, 10);
		img.click();
		signout.click();

	}
}
