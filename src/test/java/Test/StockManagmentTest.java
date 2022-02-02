package Test;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.BannedUserPage;
import Page.StockManagmentPage;
import org.testng.annotations.Test;

public class StockManagmentTest extends Base {
	 @Test(priority=14,description="TC_014_Verify StockManagment Tabs  ")
	  public void User() {
		 
		 StockManagmentPage smp=new StockManagmentPage(driver);
		  smp.login();
		  List<String> listExp=smp.getExpectedValue();
		  List<String> listAct=smp.getActualUserManagementTabValues();
		  SoftAssert s=new SoftAssert();
		  s.assertEquals(listAct, listExp, "tabs didnt exist");
		
}
}
