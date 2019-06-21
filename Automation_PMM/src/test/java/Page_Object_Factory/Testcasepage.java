package Page_Object_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testcasepage {
	WebDriver driver;
	public  Testcasepage(WebDriver driver)
	{
		this.driver=driver;
	}
	By Status=By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div//div[2]/div[3]/div/div/div/div[2]/div[3]/span[2]");
	By local_run=By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div/div/div[2]/a[3]/i");
	By Steps_count=By.xpath("html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[3]/table/tbody/tr");
    By Run_test=By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[2]/a[@title='Run Test']/i");
    By no_of_steps=By.xpath("html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[3]/table/tbody/tr");
    By Run_test1=By.xpath("html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[2]/a[1]");
    By Stop_test=By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[2]/a[3]/i");
    By close_testcase=By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div/ul/li[3]/a/div/i");
    By Passed_image=By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/img[@title='PASS']");
    By Failed_image=By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/img[@title='FAIL_STOP']");
} 
