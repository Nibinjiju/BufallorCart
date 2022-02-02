package Test;

import org.testng.Assert;
import org.testng.annotations.Test;


import Page.EditUserPage;

public class EditUserTest extends Base {
	
	 @Test(priority=23,description="TC_023_Verify user can edit user list")
	  public void verifyUserCanEditUserList() {
		  EditUserPage up=new EditUserPage(driver);
		  up.login();
		  up.link();
		 String actual=up.verify();
		 String Expected="Lorem Ipsum";
		  Assert.assertEquals(actual,Expected, "cannot edit");
		  
	 }
}
