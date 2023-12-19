package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderAnnotation {

public static WebDriver driver; 
	
	public static SoftAssert soft; 
	
	
	@BeforeMethod 
	
	public void launchBrowser() {
		
	String name = "Chrome"; 
	
	if(name.equalsIgnoreCase("chrome")) {
		
		driver = new ChromeDriver();
	}
	
	else if(name.equalsIgnoreCase("firefox")) {
		
		driver = new FirefoxDriver(); 
	}
	
	else if(name.equalsIgnoreCase("safari")) {
		
		driver = new SafariDriver();
	}
	
	else {
	
		driver = new ChromeDriver(); 
		
		}
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}
	
	 
	  @Test (priority = 1, dataProvider = "getData") 
	  
	  public void loginValidation(String username, String password) {
		  
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement user = driver.findElement(By.xpath("//*[@name = 'username']"));
	  
	  user.sendKeys(username);
	  
	  
	  WebElement pass = driver.findElement(By.xpath("//*[@ name = 'password']"));
	  
	  pass.sendKeys(password);
	  
	  
	  WebElement login = driver.findElement(By.xpath("//*[@ type = 'submit']"));
	  
	  login.click();
	  
	  
	  WebElement breadcrumb =
	  driver.findElement(By.xpath("//*[@class = 'oxd-topbar-header-breadcrumb']//h6"));
	  
	  String titleFromBuild = breadcrumb.getText();
	  
	  soft = new SoftAssert();
	  
	  soft.assertEquals(titleFromBuild, "Dashboard");
	  
	  Reporter.log("Login is successeful and test case is passed.", true);
	  
	  soft.assertAll();
	  
	  }
	 
	  
	
	@AfterMethod 
	
	public void tearDown() {
		
		driver.quit();
	}
	
	
	@DataProvider (name = "getData")
	
	public Object[][] getData() {
		
		Object [] [] data = new Object[4] [2];
		
		data[0] [0] = "Admin"; 
		data[0] [1] = "admin123";
		
		data[1] [0] = "Admin";
		data [1] [1] = "admin12";
		
		data[2] [0] = "Adminn";
		data[2] [1] = "admin123";
		
		data[3] [0] = "Admin33";
		data[3] [1] = "azmin0";
		
	return data; 	
	
		
	}
	
	
	
}
