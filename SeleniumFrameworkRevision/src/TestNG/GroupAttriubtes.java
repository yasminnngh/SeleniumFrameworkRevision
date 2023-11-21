package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GroupAttriubtes {

public static WebDriver driver; 
	
	public static SoftAssert soft; 
	
	
	@BeforeTest (groups = {"smoke", "regression"})
	
	public void launchBrowser() {
		
	driver = new ChromeDriver(); 
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test (priority = 2, groups = {"smoke", "regression"})
	
	public void urlValidation() {
		
		String urlFromBuild = driver.getCurrentUrl();
		
		soft = new SoftAssert(); 
		
		soft.assertEquals(urlFromBuild, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
		Reporter.log("URL is matching and test case is passed.", true);
		
		soft.assertAll();
	}
	
	@Test (priority = 3, groups = {"smoke", "regression"})
	
	public void titleValidation() {
		
		String titleFromBuild = driver.getTitle();
		
		soft = new SoftAssert(); 
		
		soft.assertEquals(titleFromBuild, "OrangeHRM");
		
		Reporter.log("Title is matching and test case is passed.", true);
		
		soft.assertAll();
	}
	
	 
	  @Test (priority = 4, groups = "regression") 
	  
	  public void loginValidation() {
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement user = driver.findElement(By.xpath("//*[@name = 'username']"));
	  
	  user.sendKeys("Admin");
	  
	  
	  WebElement pass = driver.findElement(By.xpath("//*[@ name = 'password']"));
	  
	  pass.sendKeys("admin123");
	  
	  
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
	 
	  
	  @Test (priority = 5, groups = {"smoke", "regression"})
	  
	  public void adminTabValidation() {
		  
		 WebElement admin =  driver.findElement(By.xpath("(//*[@class = 'oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
		 
		 admin.click();
		  
		 
		String titleFromBuild = driver.findElement(By.xpath("(//*[@class = 'oxd-topbar-header-breadcrumb']//h6)[1]")).getText();
		 
		soft = new SoftAssert(); 
		
		soft.assertEquals(titleFromBuild, "Admin");
		
		Reporter.log("Title is matching and test case passed", true);
		
		soft.assertAll();
		
	  }
	  
	  
	  @Test (priority = 6, groups = "regression")
	  
	  public void logout() {
		  
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		 WebElement userButton = driver.findElement(By.xpath("//*[@class = 'oxd-userdropdown-tab']"));
		  
		 userButton.click();
		 
		 driver.findElement(By.linkText("Logout")).click();
		 
	  }
	
	@AfterTest (groups = {"smoke", "regression"})
	
	public void tearDown() {
		
		driver.quit();
	}
	
	

	
}
