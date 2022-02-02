package Page;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.WaitUtility;

public class HomePage {

	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//small[@class='text-sm']")
	private WebElement date;

	@FindBy(xpath = "//a[@class='btn btn-block btn-default']")
	private WebElement getAcc;

	@FindBy(xpath = "//button[@name='mark_attendance']")
	private WebElement markattendance;

	@FindBy(xpath = "//a[@href=\"https://erp.buffalocart.com/admin/dashboard/set_clocking/\"]")
	private WebElement clockIn;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signout;

	@FindBy(xpath = "//img[@class='img-xs user-image']")
	private WebElement img;

	@FindBy(xpath = "//a[@href=\"https://erp.buffalocart.com/login\"]")
	private WebElement remembered_password;

	@FindBy(xpath = "//a[@class='text-muted']")
	private WebElement forgot;
	
	@FindBy(xpath = "//i[@class='fa fa-arrow-left']")
	private WebElement clockOut;
	
	@FindBy(xpath = "//span[@class='fa fa-check']")
	private WebElement markAll;
	
	@FindBy(xpath = "//input[@id='s-menu']")
	private WebElement searchMenu;
	
	@FindBy(xpath = "//a[@title='User']")
	private WebElement userTitle;
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		username.sendKeys("admin");
		password.sendKeys("123456");
		submit.click();
	}

	public String getDate() {
		SimpleDateFormat timestamp = new SimpleDateFormat(" EEEE dd MMMMM-yyyy");
		String currentdate = timestamp.format(Calendar.getInstance().getTime());
		img.click();
		signout.click();
		return currentdate;

	}

	public String getAcc() {
		WaitUtility.waitImplicit(driver, 10);
		
		getAcc.click();
		WaitUtility.waitImplicit(driver, 10);
		driver.navigate().back();
		return driver.getCurrentUrl();

	}

	public void markAttendance() {
		username.sendKeys("admin");
		password.sendKeys("123456");
		WaitUtility.waitforElementToBeVsisible(driver, markattendance, 10);
		markattendance.click();
		markAll.click();
	}

	public void remember_password() {
		
		forgot.click();
		remembered_password.click();
	}
	
	public String clockIn() {
	
		clockOut.click();
		return clockIn.getText();
	}
	
	public String search() {
		searchMenu.sendKeys("User");
		return userTitle.getText();
	}

}
