package Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StockManagmentPage {

	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[@href=\"#stock\"]")
	private WebElement stockicon;
	
	private final String _Stock = "//ul[@id=\"stock\"]";
    @FindBy(xpath = _Stock)
    private List<WebElement> Stock;
    
    WebDriver driver;

	public StockManagmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		username.sendKeys("admin");
		password.sendKeys("123456");
		submit.click();
	}
	
	public List<String> getActualUserManagementTabValues()
    {
       stockicon.click();
        List<String> listActual = new ArrayList<String>();
        for (int i = 0;i< Stock.size();i++)
        {
            listActual.add(Stock.get(i).getText());
        }
        return listActual;
    }
	public List<String> getExpectedValue() {
		List<String> listExpected=new ArrayList<String>();
		listExpected.add("Items ");
		listExpected.add("Supplier");
		listExpected.add("Purchase");
		listExpected.add("Return Stock");
		listExpected.add("Purchase Payment");
		
		return listExpected;
		
	}

}
