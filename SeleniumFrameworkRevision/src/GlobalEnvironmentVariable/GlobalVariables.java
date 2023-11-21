package GlobalEnvironmentVariable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class GlobalVariables {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File path = new File("/Users/yasminghahramani/eclipse-workspace/SeleniumFrameworkRevision/Resources/config.properties"); 
		
		FileInputStream fis = new FileInputStream(path); 
		
		Properties prop = new Properties(); 
		
		prop.load(fis);
		
		String text = prop.getProperty("browser"); 
		
		
		if(text.equalsIgnoreCase("chrome")) {
			
		 driver = new ChromeDriver(); 
		
		}
		
		
		if(text.equalsIgnoreCase("firefox")) {
			
		 driver = new FirefoxDriver(); 
			
		}
		
		
		if(text.equalsIgnoreCase("safari")) {
			
		 driver = new SafariDriver(); 	
			
		}
		
		
		String url = prop.getProperty("url"); 
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
	}

}
