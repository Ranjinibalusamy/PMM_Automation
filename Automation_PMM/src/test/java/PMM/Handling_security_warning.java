
package PMM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.firefox.FirefoxProfile;



public class Handling_security_warning {
	
	public static void Handling_security_warning() throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		Robot robot=new Robot();
		 Thread.sleep(5000);
		 robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(30000);
	     robot.keyPress(KeyEvent.VK_TAB);  	
	     robot.keyRelease(KeyEvent.VK_TAB);	
	   	 Thread.sleep(2000);
	     robot.keyPress(KeyEvent.VK_TAB);
	     robot.keyRelease(KeyEvent.VK_TAB);	
	     Thread.sleep(2000);
	   	 robot.keyPress(KeyEvent.VK_SPACE);
	   	 robot.keyRelease(KeyEvent.VK_SPACE);
		 robot.keyPress(KeyEvent.VK_TAB);
	   	 robot.keyPress(KeyEvent.VK_ENTER);
	     Thread.sleep(20000);
	}

}
