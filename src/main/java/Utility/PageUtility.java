package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public static void scrollDown(WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,200)");
	}
	
	
	public static void screenShot(WebDriver driver,String Screenshotname) throws IOException {
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		  File source=ss.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(source, new File(System.getProperty("user.dir")+ "/Screenshots/" + Screenshotname + ".png"));
		  System.out.println("Screenshot taken");
	}
	
	public static void enterTextWithclear(WebElement element,String text) {
		element.clear();
		element.sendKeys(text);
		
	}
	
	public static void enterText(WebElement element,String text) {
		element.sendKeys(text);
	}
	
	public static void selectItemByIndex(WebElement element,int value) {
		
		Select s=new Select(element);
		s.selectByIndex(value);
	}
	
	public static void selectItemByVisibletext(WebElement element,String text) {
		
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	public static void hitEnter(WebDriver driver,WebElement element) {
		element.sendKeys(Keys.ENTER);
	}
	
	public static void clickButton(WebDriver driver,WebElement element) {
		
		JavascriptExecutor  js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		
	}

	public static void mouseOver(WebDriver driver,WebElement element) {
		
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();
		
	}
	
	public static void clickActionButton(WebDriver driver,WebElement element) {
		
		Actions actions=new Actions(driver);
//		actions.moveToElement(element).build().perform();
//		element.click();
		actions.click(element).build().perform();
	}
	
	public static void actionClassSendkeys(WebDriver driver,WebElement element,String text) {
		
		Actions actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
		element.sendKeys(text);
		
	}
	
	public static void dragAndDrop(WebDriver driver,WebElement source,WebElement target,WebElement frame) {
		
		Actions actions=new Actions(driver);
		driver.switchTo().frame(frame);
		actions.dragAndDrop(source, target).perform();
		driver.switchTo().defaultContent();
		
	}
	
	public static String  getText(WebElement element) {
		return element.getText();
	}
	
}


