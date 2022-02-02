package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.PageUtility;
import Utility.WaitUtility;

public class EditClientPage {
	
	
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//a[@title='Client']")
	private WebElement client;
	
	@FindBy(xpath="//i[@class='fa fa-pencil-square-o']")
	private WebElement edit;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement companyName;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement companyEmail;
	
	@FindBy(xpath="//a[@class='text-info']")
	private WebElement validField;
	@FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
	private WebElement save;
	
	@FindBy(xpath="//span[@class='fa fa-list-alt']")
	private WebElement view;
	
	@FindBy(xpath="//div[@class='col-md-6']")
	private WebElement table;
	
	@FindBy(xpath="//span[@class='btn btn-default btn-file']")
	private WebElement upload;
	
	@FindBy(xpath="//a[@style='background-color: #1797be;color: #ffffff']")
	private WebElement importClient;
	
	@FindBy(xpath="//span[@class='select2-selection__rendered']")
	private WebElement customer;
	
	@FindBy(xpath="//button[@class='btn btn-sm btn-primary']")
	private WebElement upload1;
	
	@FindBy(xpath="//span[@class='fa fa-trash-o']")
	private WebElement delete;
	
	
	@FindBy(xpath="//button[@class='btn-block btn btn-danger']")
	private WebElement proceedanyway;
	
	@FindBy(xpath="//a[@class='text-info']")
	private WebElement textafterdelete;
	
	@FindBy(xpath="//a[@class='text-muted']")
	private WebElement linkclient;
	
	
	WebDriver driver;

	public EditClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		username.sendKeys("admin");
		password.sendKeys("123456");
		submit.click();
	}

	public void clientlink() {
		client.click();
		
				
	}
	public String editMethod() {
		edit.click();
		companyName.clear();
		companyName.sendKeys("techBio");
		companyEmail.clear();
		companyEmail.sendKeys("ninan@gmail.com");
		save.click();
		return validField.getText();
	}
	public String viewMethod() {
		view.click();
		 return driver.getTitle();
				 
	}
	
	
	public String deleteMethod() {
		linkclient.click();
		delete.click();
		proceedanyway.click();
		return textafterdelete.getText();
		
		
	}
	
}
