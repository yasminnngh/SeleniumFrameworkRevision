package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {

//If you add hard assert, when your expected is not matching with actual result, then your execution gets failed/terminates. (If you have 1000 test cases & test case 100 got failed, you won't be able to access the other 900 test cases, until & unless you fix it.)
//With soft assert, even if the expected & actual is not matching it won't affect your execution & it will show you the result at the end of the execution. 
	
	
public static WebDriver driver;

public static SoftAssert soft;
	
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
		
		soft = new SoftAssert(); 
		
		soft.assertEquals(urlFromBuild, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Reporter.log("URL is matching and test case has passed.", true);
		
		soft.assertAll();
	}
	
	
	@Test (priority = 3)
	
	public void titleValidation() {
		
		String titleFromBuild = driver.getTitle();
		
		soft = new SoftAssert(); 
		
		soft.assertEquals(titleFromBuild, "OrangeHRM");
		
		Reporter.log("Title is matching and test case has passed", true);
		
		soft.assertAll();
	}
	

	@Test (priority = 4)
	
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	
	
}
