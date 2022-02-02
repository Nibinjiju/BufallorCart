package Test;

import org.testng.annotations.Test;

import Utility.ReadConfig;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Base {
	public WebDriver driver;
	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getapplicationURL();
  @Test
  public void base() {
  }
  @Parameters("browser")
  @BeforeClass
  public void beforeClass(String br) {
	  
	  
	  if(br.equals("chrome")) 
		  
	  {
		  System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		  driver=new ChromeDriver();
	  }
	  
	  else if(br.equals("firefox"))
		  
	  {
		  System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxPath());
		  driver=new FirefoxDriver();
		  
	  }
	  else if(br.equals("edge")) {
		  System.setProperty("webdriver.edge.driver", readconfig.getEdgePath());
		  driver=new EdgeDriver();
		  
	  }
	  
	  driver.get(baseURL); 
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	
}
public void onTestFailure(ITestResult result) {
	// TODO Auto-generated method stub
	
}
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}


}
