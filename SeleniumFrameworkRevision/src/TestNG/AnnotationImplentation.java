package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AnnotationImplentation {

	public static WebDriver driver; 
	
	public static SoftAssert soft; 
	
	
	@BeforeMethod
	
	public void launchingBrowser() {
		
		driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	
	@Test (priority = 1)
	
	public void urlValidation() {
		
		String urlFromBuild = driver.getCurrentUrl();
		
		soft = new SoftAssert(); 
		
		soft.assertEquals(urlFromBuild, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Reporter.log("URL is matching, test case is passed.", true);
		
		soft.assertAll();
	}
	
	
	@Test (priority = 2)
	
	public void titleValidation() {
		
		String titleFromBuild = driver.getTitle();
		
		soft = new SoftAssert(); 
		
		soft.assertEquals(titleFromBuild, "OrangeHRM");
		
		Reporter.log("Tite is matching, test case is passed.", true);
		
		soft.assertAll();
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	
	//With Before & After Method the browser opens & close on the basis of test count. 
	//With Before & After Suite/Test the browser opens & closes once. 
	
	
	
	
	
}
