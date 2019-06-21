package PMM;
import Page_Object_Factory.Subjectloginpage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Testsuite {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	public static ExtentReports report;
	public static ExtentTest logger;

   
	
	@BeforeSuite
	public void login()throws AWTException, InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "C:/workspace/geckodriver.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,1200);
		report = new ExtentReports(System.getProperty("user.dir") +"/Reports/TestReport.html", true);
		logger=report.startTest("Test Suite","Integration_Suite_Authorization");
		int noofrows = 0,i=1;
		Subjectloginpage sl=new Subjectloginpage(driver);
		driver.get(sl.url);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
	   	driver.findElement(By.name("username")).sendKeys(sl.user);
		driver.findElement(By.name("password")).sendKeys(sl.pwd);
		driver.findElement(By.id("submitButton")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div/div/div/div/div/div/ul/li[2]/a/span[contains(text(),'Library')]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div[2]/ul/li[1]/a/span[contains(text(),'Tests')]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[3]/div/div[8]/div[2]/table/tbody/tr[1]/th[1]/div"))).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'PMM')]"))).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Automation_PMM')]"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Integration_Suite_Authorization')]"))).click();
		Thread.sleep(2000);
	    noofrows=driver.findElements(By.xpath("html/body/div/div/div[2]/div/div/div/div/div//div/div/div/div[2]/div[2]/div[3]/div/div[8]/div[4]/table/tbody[1]/tr")).size();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div/div/div[2]/div/div/div/div/div//div/div/div/div[2]/div[2]/div[3]/div/div[8]/div[4]/table/tbody[1]/tr["+i+"]/td[2]/div/a/i"))).click();
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/div/div//div[2]/div[3]/div/div/div/div[2]/div[3]/span[2]")));
	   	driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/div/div//div[2]/div[3]/div/div/div/div[2]/div[3]/span[2]")).getText();
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div/div/div[2]/a[3]/i")));
	    driver.findElement((By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div/div/div[2]/a[3]/i"))).click();
	    System.out.println("Number of Test Scripts in Integration Suite Authorization:"+noofrows);
	  	Handling_security_warning.Handling_security_warning(); //Method to handle Java Applet 
	    String text=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/div/div//div[2]/div[3]/div/div/div/div[2]/div[3]/span[2]")).getText();
	    logger=report.startTest("Integration_Suite_Authorization");
		logger.log(LogStatus.INFO, "Number of Test cases in Authorization Integration Suite::"+noofrows);
	    logger.log(LogStatus.INFO, "Subject 7:"+text);
	 
	    if(text.contentEquals("Not Connected"))
	    {
	      logger.log(LogStatus.INFO, "Not Able to connect the Subject 7 local run");
	    	//System.out.println("Not Able to connect the Subject 7 local run");
	    
	    	driver.quit();
	    }
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/ul/li[3]/a/div/i"))).click();
		
	}
	@AfterSuite
	public void endReport()
		{
		report.endTest(logger);
		driver.close();
		report.flush();
		report.close();
		}
		
	}
	
	