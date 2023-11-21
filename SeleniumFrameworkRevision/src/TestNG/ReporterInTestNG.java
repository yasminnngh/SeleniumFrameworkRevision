package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterInTestNG {
	

	@Test(priority = 0)
	
	public void Atest() {
		
		Reporter.log("Test Case 1", true);
		
	}
	
	@Test(priority = 1)
	
	public void test() {
	
		Reporter.log("Test Case 2", false);
		
	}
	
	@Test(priority = 2)
	
	public void Btest() {
		
		Reporter.log("Test Case 3", true);
		
	}
	
	@Test(priority = 3)
	
	public void Ctest() {
		
		Reporter.log("Test Case 4", false);
		
	}
	
	@Test(priority = 4)
	
	public void Dtest() {
		
		Reporter.log("Test Case 5", true);
		
	}
	
	
}
