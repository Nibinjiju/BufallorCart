package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.ClientPage;
import Page.EditClientPage;

public class EditClientTest extends Base {
	

	 @Test(priority=20,description="TC_020_Verify user can edit client list")
	  public void verifyEditOfClientList() {
	 	 EditClientPage edit=new EditClientPage(driver);
	 	 edit.login();
	 	 edit.clientlink();
	 	 String actual=edit.editMethod();
	 	 String expected="techBio";
	 	 Assert.assertEquals(actual, expected,"edit is not working");
	 	 
	 	 
	 } 
	 @Test(priority=21,description="TC_021_Verify user can view client list")
	  public void verifyViewOfClientList() {
		 EditClientPage edit=new EditClientPage(driver);
		 String expected="View Client Details";
		 String actual=edit.viewMethod();
		Assert.assertEquals(actual, expected,"cant view client list");
		 
	 }
	 @Test(priority=22,description="TC_022_Verify user can delete client list")
	  public void verifyDeleteOfClientList() {
		 EditClientPage edit=new EditClientPage(driver);
		String actual= edit.deleteMethod();
		String exp="ninan";
		Assert.assertNotEquals(actual, exp,"client is not deleted");
		 
		 
	 }
	 
	 }