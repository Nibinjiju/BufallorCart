package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserPage {
	
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

	
	@FindBy(xpath="//table[@id='DataTables']//tbody//tr[1]//td[2]")
	private WebElement dataAfterEdit;
	
	@FindBy(xpath="//i[@class='fa fa-pencil-square-o']")
	private WebElement firstEdit;
	
	
	@FindBy(xpath="//input[@name='fullname']")
	private WebElement fullname;
	
	@FindBy(xpath="//button[@class='btn btn-sm btn-primary']")
	private WebElement updateuser;
	
	@FindBy(xpath="//a[@href='#manage']")
	private WebElement alluser;	

	WebDriver driver;

	public EditUserPage(WebDriver driver) {
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
		firstEdit.click();
		fullname.clear();
		fullname.sendKeys("Lorem Ipsum");
		updateuser.click();
		alluser.click();
	
	}
	
	public String verify() {
		
		return dataAfterEdit.getText();
	}

}
