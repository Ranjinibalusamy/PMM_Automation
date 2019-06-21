package PMM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import PMM.Individual_Step_Status;

import com.relevantcodes.extentreports.LogStatus;

public class Testcase6 extends Testsuite
{
	@Test
	public void testcase6() throws InterruptedException
	{
	int	i=6,noofstatus,count;
	String Finalstatus,testcasename;
	testcasename=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[3]/div/div[8]/div[4]/table/tbody/tr["+i+"]/td[2]/div/a")).getText();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div/div/div[2]/div/div/div/div/div//div/div/div/div[2]/div[2]/div[3]/div/div[8]/div[4]/table/tbody[1]/tr["+i+"]/td[2]/div/a/i"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[2]/a[@title='Run Test']/i")));
    driver.findElement(By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[2]/a[@title='Run Test']/i")).click();
    noofstatus=driver.findElements(By.xpath("html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[3]/table/tbody/tr")).size();
  	Thread.sleep(50000);
	count=Individual_Step_Status.Individual_Step_Status(driver,noofstatus); // Method to check the individual status of each step 
	Finalstatus= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/img"))).getAttribute("title");
	if ( count!=0)
	 {	
		Finalstatus= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/img"))).getAttribute("title");
			 if(Finalstatus.contentEquals("FAIL_SKIP") || Finalstatus.contentEquals("PASS"))
		 {
			 System.out.println("Test case "+i+" name: "+testcasename+":Passed");
			 logger.log(LogStatus.INFO,"Testcase Name :"+testcasename);
 	    	  logger.log(LogStatus.PASS, testcasename, "Passed");
 		    
		 }
		 
	 }
	else
	{
		//Thread.sleep(20000);
		if(Finalstatus.contentEquals("FAIL_STOP") || Finalstatus.contentEquals("ERROR"))
		{
			System.out.println("Test case "+i+" name: "+testcasename+":Failed");
			
				logger.log(LogStatus.INFO,"Testcase Name :"+testcasename);
				logger.log(LogStatus.FAIL,"Failed");
					 
		 }
				 
	 }
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/ul/li[3]/a/div/i"))).click();
		report.endTest(logger);
	}

}
