package Page_Object_Factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Subjectloginpage {
	WebDriver driver;
	public  Subjectloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public String url="http://proof.grantsolutions.gov/login.zul";
	public String user="ssinha";
	public String pwd="Test1234!";
	By username=By.name("username");
	By password=By.name("password");
	By login=By.id("submitButton");
	By Library=By.xpath("html/body/div/div/div/div/div/div/ul/li[2]/a/span[contains(text(),'Library')]");
	By Tests=By.xpath("html/body/div[2]/ul/li[1]/a/span[contains(text(),'Tests')]");
	By PMM=By.xpath("//a[contains(text(),'PMM')]");
	By Automation_PMM=By.xpath("//a[contains(text(),'Automation_PMM')]");
	By Integration_Suite_TA_Tool=By.xpath("//a[contains(text(),'Integration_Suite_TA_Tool");
	By Rows_Count=By.xpath("//html/body/div/div/div[2]/div/div/div/div/div//div/div/div/div[2]/div[2]/div[2]/div/div[8]/div[4]/table/tbody[1]/tr");
	

	}
