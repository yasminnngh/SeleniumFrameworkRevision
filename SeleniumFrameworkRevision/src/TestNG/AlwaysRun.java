package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlwaysRun {

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
		
		soft.assertEquals(urlFromBuild, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login123");
	
		Reporter.log("URL is matching current URL and test case has passed", true);
		
		soft.assertAll();
	}
	
	
	@Test (priority = 3, dependsOnMethods = "urlValidation", alwaysRun = true)
	
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
