package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAsserts {

	//Asserts is to validate the test cases, to make sure expected & actual is matching.
	
	//Report.log is like SYSOUT. Means to print the user defined messages in console as well as, in html report. 
	
	public static WebDriver driver;
	
	@Test (priority = 1)
	
	public void launchBrowser() {
		
		 driver = new ChromeDriver(); 
		
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test (priority = 2)
	
	public void urlValidation() {
		
		String urlFromBuild = driver.getCurrentUrl();
		
		Assert.assertEquals(urlFromBuild, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		Reporter.log("URL is matching and test case has passed.", true);
	}
	
	
	@Test (priority = 3)
	
	public void titleValidation() {
		
		String titleFromBuild = driver.getTitle();
		
		Assert.assertEquals(titleFromBuild, "OrangeHRM");
		
		Reporter.log("Title is matching and test case has passed", true);
	}
	

	@Test (priority = 4)
	
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	
	
	
	
}
