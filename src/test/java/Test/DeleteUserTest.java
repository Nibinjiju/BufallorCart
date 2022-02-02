package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.DeleteUserPage;


public class DeleteUserTest extends Base {

	 @Test(priority=24,description="TC_0124_Verify user can delete user ")
	  public void User() {
		  DeleteUserPage delete=new DeleteUserPage(driver);
		  delete.login();
		  delete.link();
		  
		  String Expected=delete.link();
		 String actual=delete.verify();
		 
		
		  Assert.assertNotEquals(actual,Expected, "user hasnt been deleted");
		  
	 }
}
