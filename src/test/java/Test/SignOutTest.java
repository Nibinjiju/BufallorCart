package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.SignOutPage;

public class SignOutTest extends Base {
  @Test(priority=15,description="TC_015_Verify log out")
  public void signOut() {
	  SignOutPage sg=new SignOutPage(driver);
	  sg.login();
	  sg.logout();
	  SoftAssert s=new SoftAssert();
	  s.assertAll();
	  
  }
}
