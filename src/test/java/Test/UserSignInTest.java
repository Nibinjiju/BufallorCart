package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page.UserSignInPage;

public class UserSignInTest extends Base {
	@Test(priority = 29, description = "TC_029_Verify user can login with  newley added user")
	public void verifyUserCanLoginWithNewAddedUser() {
		UserSignInPage us = new UserSignInPage(driver);
		us.login();
		String exp = "ninan varghese";

		String Actual = us.loginVerify();
		Assert.assertEquals(Actual, exp, "invalid credentials");

	}

	@Test(priority = 30, description = "TC_030_Verify user can login with  newley added user")
	public void verifyTitleOfUserSignIn() {
		UserSignInPage us = new UserSignInPage(driver);
		String exp = "Welcome to Codecarrots";
		String Actual = us.title();
		Assert.assertEquals(Actual, exp, "invalid title");

	}

}