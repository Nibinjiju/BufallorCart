package Test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.AddClientPage;
import Page.AddUserPage;
import Utility.ExcelData;

public class AddUserTest extends Base{
  

@Test(priority=1) 
public void user1() {
	 AddUserPage us=new AddUserPage(driver);
	  us.login();
	  us.link();
	  us.user();
}

@Test(priority=2,dataProvider="dp")

public void adduser(String funame,String empId,String usename,String passwd,String confmpasswd,String email,String ph,String mb,String skp) throws InterruptedException {
	AddUserPage ad=new AddUserPage(driver);
	  ad.set(funame,empId,usename,passwd,confmpasswd,email,ph,mb,skp);	
	  
	   }
 @DataProvider
 public Object[][] dp() throws InvalidFormatException, IOException {
	  Object[][] data=ExcelData.getDataFromSheet("D:\\new.xlsx");
	  return data;
   
 }
 @Test(priority=3)
 public void adduser1() {
	 AddUserPage ad=new AddUserPage(driver);
	 ad.user1();
	 
	 
 }
}