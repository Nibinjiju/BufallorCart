package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WaitUtility;

public class ClientPage {
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	@FindBy(xpath = "//a[@title='Client']")
	private WebElement client;
	
	@FindBy(xpath="//td[@valign='top']")
	private WebElement field;
	
	@FindBy(xpath="//input[@class='form-control input-sm']")
	private WebElement search;
	
	@FindBy(xpath="//a[@class='text-info']")
	private WebElement validField;
	
	@FindBy(xpath = "//a[@href='#new_client']")
	private WebElement newclient;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement companyName;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement companyEmail;
	
	@FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
	private WebElement save;
	
	@FindBy(xpath="//li[@class='parsley-required']")
	private WebElement mandatoryField;
	

	WebDriver driver;


	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		username.sendKeys("admin");
		password.sendKeys("123456");
		submit.click();
		
	}

	public void link() {
		client.click();
	}
	public void newClientLink() {
		newclient.click();
	}
	public String searchInvalid() {
		search.sendKeys("nnnn");
		WaitUtility.waitforElementToBeVsisible(driver, field, 100);
		
		return field.getText();
		
	}
	public String searchValid() {
		search.clear();
		search.sendKeys("techBio");
		return validField.getText();
		
	}
	public String mandatoryField() {
		companyName.sendKeys(" ");
		companyEmail.sendKeys("  ");
		save.click();
		return mandatoryField.getText();	
	}
	public void userAdd() {
		 companyName.sendKeys("aravind");
		 companyEmail.sendKeys("abc@gmail.com");
		 save.click();
		
	}
	public String userAdd1() {
		return validField.getText();
	}


}
