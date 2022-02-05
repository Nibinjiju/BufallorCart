package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSignInPage {
	
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//span[@class='hidden-xs']")
	private WebElement img;
	
	@FindBy(xpath="//a[@href=\"https://erp.buffalocart.com/login/logout\"]")
	private WebElement  login2;
	
	
	
	
	WebDriver driver;

	public UserSignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void login() {
		username.sendKeys("ninan");
		password.sendKeys("123456");
		submit.click();
		login2.click();
		username.sendKeys("ninan");
		password.sendKeys("123456");
		submit.click();
	}
	
	public String loginVerify() {
		 return img.getText() ;
		
	}
	public String title() {
		return driver.getTitle();
	}

}
