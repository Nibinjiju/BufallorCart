package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteUserPage {
	
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
	
	@FindBy(xpath = "//span[@class='fa fa-trash-o']")
	private WebElement delete;
	
	@FindBy(xpath="//table[@id='DataTables']//tbody//tr[1]//td[2]")
	private WebElement dataAfterEdit;
	
	@FindBy(xpath="//button[@class='btn-block btn btn-danger']")
	private WebElement proceedAnyway;
	

	WebDriver driver;

	public DeleteUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		username.sendKeys("admin");
		password.sendKeys("123456");
		submit.click();
	}

	public String link() {
		search.sendKeys("user");
		user.click();
		return dataAfterEdit.getText();
		
}
	
	public String verify() {
		
		delete.click();
		proceedAnyway.click();
		return dataAfterEdit.getText();
		
		
	}
}
