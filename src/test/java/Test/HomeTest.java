package Test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.HomePage;
import Page.LoginPage;
import Utility.ExcelData;
import Utility.PageUtility;

public class HomeTest extends Base {
	SoftAssert s = new SoftAssert();

	@Test(priority = 7, description = "TC_007_Verify Rembember password button")
	public void rememberedPassword() {

		HomePage hp = new HomePage(driver);
		hp.remember_password();
		String expectedurl = "https://erp.buffalocart.com/login";
		String Actualurl = driver.getCurrentUrl();
		Assert.assertEquals(expectedurl, Actualurl);

	}

	@Test(priority = 8, description = "TC_008_Verify Get Your Accout Page")
	public void verifyGetYourAccountPage() {

		HomePage hp = new HomePage(driver);
		String actualURL = hp.getAcc();
		String expURL = "https://erp.buffalocart.com/login";
		Assert.assertEquals(actualURL, expURL, "cannot load getAccount");
	}

	@Test(priority = 9, description = "TC_009_Verify Home Page title")
	public void verifyhomePagetitle() {

	
		HomePage hp = new HomePage(driver);
		hp.login();
		String expectedtitle = "Manage Client";
		String actualtitle = driver.getTitle();
		s.assertEquals(actualtitle, expectedtitle, "invalid title");
	}

	@Test(priority = 10, description = "TC_010_Verify date in home page")

	public void verifydate() throws ParseException {
		HomePage hp = new HomePage(driver);
		String actual = hp.getDate();
		String exp = " Saturday 29 January-2022";
		System.out.println(actual);
		System.out.println(exp);
		Assert.assertEquals(actual, exp, "date didnt match");

	}
	
	@Test(priority = 11, description = "TC_011_Verify Whether Attendance is Marked")
	public void verifyAttendanceMark() {
		HomePage hp = new HomePage(driver);
		 hp.markAttendance();
		
	}
	
	@Test(priority = 12, description = "TC_012_Verify Clock Out ")
	public void verifyClockIn() {

		HomePage hp = new HomePage(driver);
		String expectedtitle = "Clock In";
		String actualtitle = hp.clockIn();
		Assert.assertEquals(actualtitle, expectedtitle, "didnt clock in");
	}
	@Test(priority = 13, description = "TC_013_Verify Search Menu ")
	public void verifySearchMenu() {
	
		HomePage hp = new HomePage(driver);
		String expectedtitle = "User";
		String actualtitle = hp.search();
		Assert.assertEquals(actualtitle, expectedtitle, "Search Is Not Working");
	}
}
