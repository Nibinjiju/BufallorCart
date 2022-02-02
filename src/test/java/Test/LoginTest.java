package Test;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import Page.LoginPage;
import Utility.ExcelData;

import Utility.PageUtility;
import Utility.WaitUtility;

import java.io.IOException;
import java.sql.DriverAction;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends Base{
	
	
	
	@Test(priority=1,description="TC_001_Verify Login Page title")
	
	public void verifyloginTitle() {
		
		
		
	String	actualtitle=driver.getTitle();
	String expectedtitle="Welcome to Codecarrots";
	Assert.assertEquals(actualtitle, expectedtitle, "invalid title");
	//ExtentTestManager.getTest().log(Status.INFO, "Hellooo started base test1");
	
   
		
	}
	
	@Test(priority=2,description="TC_002_Verify checkBox is selected")
	 
	  public void rememberMecheckBox() {
		
		  LoginPage lp=new LoginPage(driver);
		boolean checkBox=  lp.rememberMe();
		Assert.assertFalse(checkBox, "check box is not marked");
		 
	  }
	
	@Test(priority=3,dataProvider = "dp2",description="TC_003_Verify Login With Invalid credentials")
	  
	  public void verifyLoginWithInValidCredentials(String n, String s) throws IOException {
		 
		 LoginPage lp=new LoginPage(driver);
		 lp.set(n,s);
		 boolean b=lp.invalidCredentials();
		 PageUtility.screenShot(driver, "Invalid Credentials");
		 Assert.assertTrue(b);
	  
	  }
	  
	  @DataProvider
	  public Object[][] dp2() throws InvalidFormatException, IOException {
		  
		 // Object[][] data=ExcelData.getDataFromSheet("D:\\invalid.xlsx");
		  Object[][] data=ExcelData.getDataFromSheet(System.getProperty("user.dir")+"/src/test/resources/invalid.xlsx");
		  return data;
	    
	  }

	  @Test(priority=4,description="TC_004_Verify error message displayed on reset password page with invalid email id")
	  
	  public void verfiyResetPasswordPage() throws IOException {
		  LoginPage lp=new LoginPage(driver);
		  lp.resetPassword1();
		  boolean b=lp.invalidCredentials();
		  PageUtility.screenShot(driver, "Invalid email id");
			 Assert.assertTrue(b);
	  }
	  
	  @Test(priority=5,description="TC_005_Verify Forgot Password Valid credentials")
	  public void verifyForgotPassword() {
		  driver.get(baseURL);
		  LoginPage lp=new LoginPage(driver);
		  String actualURL=lp.forgotPassword();
		  String expectedURL="https://erp.buffalocart.com/login/forgot_password";
		  Assert.assertEquals(actualURL, expectedURL,"didnt load login page");  
	  }
	  
	
  @Test(priority=6,dataProvider = "dp1",description="TC_005_Verify Login With Valid credentials")
 
  public void verifyLoginWithValidCredentials(String n, String s) {
	  driver.get(baseURL);
	 LoginPage lp=new LoginPage(driver);
	  lp.set(n,s);
	  
  }
  
  @DataProvider
  public Object[][] dp1() throws InvalidFormatException, IOException {
	 // Object[][] data=ExcelData.getDataFromSheet("D:\\a.xlsx");
	  Object[][] data=ExcelData.getDataFromSheet(System.getProperty("user.dir")+"/src/test/resources/a.xlsx");
	  return data;
    
  }
 
  
 
}
