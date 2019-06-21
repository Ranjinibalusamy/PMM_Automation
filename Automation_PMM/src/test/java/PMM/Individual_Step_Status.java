package PMM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Individual_Step_Status {
	// Method to check the individual status of each step 
	public static int Individual_Step_Status(WebDriver driver,int noofstatus)  {
		// TODO Auto-generated method stub  
		int count=0;
		String status=null;
		
		 WebDriverWait wait = new WebDriverWait((WebDriver) driver,40);
		for(int j=1;j<noofstatus;j++)
    	{
			
		   try
		   {
				status=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html/body/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/div[3]/div/div[2]/div/div/div/div/div/div/div/div/div[3]/table/tbody/tr["+j+"]/td[7]"))).getAttribute("class");
				                                                                         
						
			  if(status.contentEquals("column-status step_row z-listcell") || status.contentEquals("column-status step_row passed z-listcell") || status.contentEquals("column-status step_row fail_skip z-listcell"))
			  {
				 count++; 
				
			  }
			  else if (status.contentEquals("column-status step_row fail_stop z-listcell") || status.contentEquals("column-status step_row error z-listcell"))
			  {
				  //System.out.println("Individual status"+status);
				count=0;
				break;	
			  } 	  
		   }
			catch(Exception e)
		   {
				count=0;
				 break;	
		   }
			
    	}		

    	
	     return count;
	} 

}
