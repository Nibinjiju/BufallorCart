package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.PageUtility;
import Utility.WaitUtility;

public class AddClientPage {
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//a[@title='Client']")
	private WebElement client;
	@FindBy(xpath = "//a[@href='#new_client']")
	private WebElement newclient;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement companyName;
	@FindBy(xpath = "//input[@name='email']")
	private WebElement companyEmail;
	@FindBy(xpath = "//input[@name='vat']")
	private WebElement vatNum;

	@FindBy(xpath = "//span[@title='Customer']")
	private WebElement custom;

	@FindBy(name = "short_note")
	private WebElement shortnote;

	@FindBy(xpath = "//a[@href='#contact_compnay']")
	private WebElement contactdetails;

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;

	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;

	@FindBy(xpath = "//input[@name='zipcode']")
	private WebElement code;

	@FindBy(xpath = "//input[@name='city']")
	private WebElement city;

	@FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
	private WebElement save;

	WebDriver driver;

	public AddClientPage(WebDriver driver) {
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
		newclient.click();
	}

	public void set(String n, String s, String f) {
		companyName.sendKeys(n);
		companyEmail.sendKeys(s);
		vatNum.sendKeys(f);
	}

	public void details1() {
		WaitUtility.waitforElementToBeVsisible(driver, custom, 10);
		custom.click();
		PageUtility.scrollDown(driver);
		shortnote.sendKeys("new client");
		contactdetails.click();
	}

	public void details2() {

		phone.sendKeys("04682255");
		mobile.sendKeys("99556655");
		code.sendKeys("694455");
		city.sendKeys("mumbai");
		PageUtility.scrollDown(driver);
		save.click();

	}

}
