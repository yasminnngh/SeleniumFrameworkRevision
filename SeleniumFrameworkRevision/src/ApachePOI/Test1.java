package ApachePOI;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static WebDriver driver; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		
		 
		 
		 
		 
		 
	}

}
