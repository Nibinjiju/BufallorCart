package Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.ClientPage;
import Utility.PageUtility;

public class ClientTest extends Base {
	
	
  @Test(priority=16,description="TC_016_Verify error message with invalid  client search")
  public void verifyerrorMessagewithInvalidsearch() throws IOException {
	  ClientPage client=new ClientPage(driver);
		  client.login();
		 client.link();
		 client.searchInvalid();
		String actual= client.searchInvalid();
		 PageUtility.screenShot(driver, "Invalid Client Search");
		String expected="No matching records found";
		Assert.assertEquals(actual, expected,"invalid error");
  }
  @Test(priority=17,description="TC_017_Verify valid  client search")
  public void verifyValidSearch() {
	  ClientPage client=new ClientPage(driver);
	  String actual=client.searchValid();
	  String expected="techBio";
	 Assert.assertEquals(actual, expected,"invalid");  
  }
  
  @Test(priority=18,description="TC_018_Verify Error Message displayed when filling mandatory field")
  public void verifyMandatoryfield() throws IOException {
	  ClientPage client=new ClientPage(driver);
	  client.newClientLink();
	 client.mandatoryField();
	 String actual=client.mandatoryField();
	 PageUtility.screenShot(driver, "ErrorMessage");
	 String expected="This value is required.";
	 Assert.assertEquals(actual, expected,"invalid message");
	  
  }
  @Test(priority=19,description="TC_019_Verify user can add user details")
  public void verifyUserCanAddUserDetails() {
	  ClientPage client=new ClientPage(driver);
	  client.userAdd();
	  String actual=client.userAdd1();
	  String expected="aravind";
	  Assert.assertEquals(actual, expected,"invalid");
	  
	  
	  
  }
  
  
}
