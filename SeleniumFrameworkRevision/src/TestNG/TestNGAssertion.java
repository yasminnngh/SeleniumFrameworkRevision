package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TestNGAssertion {

	@BeforeSuite
	
	public void invokingEnviornments() {
		System.out.println("Invoking the enviornment.");	
	}
	
	
	@BeforeTest
	
	public void launchingBrowser() {
		System.out.println("Launching browser for automation purpose.");
	}
	
	
	@BeforeMethod
	
	//Cookies are nothing but temporary memory stored by the browser for the navigation of pages. 
	//Session IDs are recorded actions that are stored in form of ID, which consists of logs. 
	public void cookieHandling() {
		System.out.println("Handling the cookies and session IDs.");
	}
	
	
	
	@Test 
	
	public void testCase1 () {
		System.out.println("Test Case 1");
	}
	
	@Test
	
	public void testCase2 () {
		System.out.println("Test Case 2");
	}
	
	@Test
	
	public void testCase3 () {
		System.out.println("Test Case 3");
	}
	
	
	
	@AfterMethod
	//You should clear cookies to get rid of stored memory and it won't affect the next execution, or further execution of test cases.
	public void clearCookies() {
		System.out.println("Clearing the cookies.");
	}
	
	
	@AfterTest
	
	public void closingBroser() {
		System.out.println("Closing browser for automation purpose.");
	}
	
	
	@AfterSuite
	
	//Tear down is similar to quit, used to closed connections with databases...
	
	public void tearDown() {
		System.out.println("Tear down the enviornment.");
	}
	
	
	
	
	
	
	
}
