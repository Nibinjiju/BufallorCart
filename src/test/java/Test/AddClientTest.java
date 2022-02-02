package Test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.AddClientPage;
import Utility.ExcelData;

public class AddClientTest extends Base {
	@Test(priority=1)
	public void login() {
		AddClientPage ad=new AddClientPage(driver);
		  ad.login();
		  ad.link();
		
	}
	@Test(priority=2,dataProvider="dp2")
	
	 public void addClient(String n,String s,String f) throws InterruptedException {
		AddClientPage ad=new AddClientPage(driver);
		  ad.set(n,s,f);	
		  
		   }
	  @DataProvider
	  public Object[][] dp2() throws InvalidFormatException, IOException {
		  Object[][] data=ExcelData.getDataFromSheet("D:\\l.xlsx");
		  return data;
	    
	  }
	  @Test(priority=3)
	  public void contactdetails() {
		  AddClientPage ad=new AddClientPage(driver);
		  ad.details1();
		  ad.details2();
		  
	  }
}
