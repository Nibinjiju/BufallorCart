package Test;

import org.testng.Assert;
import org.testng.annotations.Test;


import Page.UserSignInPage;

public class UserSignInTest extends Base {
	@Test(priority=16,description="TC_016_Verify user can login with  newley added user") 
	public void verifyUserCanLoginWithNewAddedUser() {
		 UserSignInPage us=new UserSignInPage(driver);
		  us.login();
		  String exp="ninan varghese";
		 
		String Actual=us.loginVerify();
		Assert.assertEquals(Actual,exp, "invalid credentials");
		
	}
}