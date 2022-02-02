package Page;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.PageUtility;
import Utility.WaitUtility;

public class AddUserPage {
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

	@FindBy(xpath = "//a[@href=\"#new\"]")
	private WebElement newuser;

	@FindBy(xpath = "//input[@name='fullname']")
	private WebElement fullname;

	@FindBy(xpath = "//input[@name='employment_id']")
	private WebElement employmentid;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usname;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement pass;

	@FindBy(xpath = "//input[@name='confirm_password']")
	private WebElement conpass;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement em;

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;

	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobile;

	@FindBy(xpath = "//input[@name='skype']")
	private WebElement skypeid;

	@FindBy(xpath = "//select[@name='role_id']")
	private WebElement dropdown1;

	@FindBy(xpath = "//span[@title='Select Designation']")
	private WebElement dropdown3;

	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement plus;

	@FindBy(xpath = "//input[@name='deptname']")
	private WebElement dept;

	@FindBy(xpath = "//input[@name='designations']")
	private WebElement designation;

	@FindBy(xpath = "//button[@name='save']")
	private WebElement popupsave;

	@FindBy(xpath = "//button[@class=\'btn btn-sm btn-primary\']")
	private WebElement save;
	
	

	WebDriver driver;

	public AddUserPage(WebDriver driver) {
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

	}


	public void user() {
		user.click();
		newuser.click();

	}

	public void set(String funame, String empId, String usename, String passwd, String confmpasswd, String email,
			String ph, String mb, String skp) {
		fullname.sendKeys(funame);
		employmentid.sendKeys(empId);
		usname.sendKeys(usename);
		pass.sendKeys(passwd);
		conpass.sendKeys(confmpasswd);
		em.sendKeys(email);
		phone.sendKeys(ph);
		mobile.sendKeys(mb);
		skypeid.sendKeys(skp);
	}

	public void user1() {
		PageUtility.selectItemByVisibletext(dropdown1, "Staff");
		plus.click();
		WaitUtility.waitImplicit(driver, 10);
		//dept.sendKeys("IT");
		designation.sendKeys("lead");
		popupsave.click();
		PageUtility.scrollDown(driver);
		WaitUtility.waitImplicit(driver, 10);
		WaitUtility.waitforElementToBeVsisible(driver, save, 50);
		save.click();

	}

}
