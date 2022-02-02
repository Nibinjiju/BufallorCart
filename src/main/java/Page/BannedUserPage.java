package Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BannedUserPage {
	
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	
	@FindBy(xpath = "//input[@id=\"s-menu\"]")
	private WebElement search;

	@FindBy(xpath = "//a[@title='User']")
	private WebElement user;
	
	@FindBy(xpath = "//span[@class='fa fa-close']")
	private WebElement banned;
	
	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement textarea;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement save;
	
	@FindBy(xpath = "//input[@name='active']")
	private WebElement checkbox;	

	WebDriver driver;

	public BannedUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		username.sendKeys("admin");
		password.sendKeys("123456");
		submit.click();
	}

	public void link() {
		search.sendKeys("user");
		user.click();
		banned.click();
		textarea.sendKeys("not important");
		save.click();
	}
	public boolean isSelected() {
		
		boolean selected=checkbox.isSelected();
		return selected;

}

}