package TestNG;

import org.testng.annotations.Test;

public class EnableAttributeInTestNG {

	@Test(priority = 0)
	
	public void testA() {
		System.out.println("Test Case 1");
	}
	
	@Test(priority = 1, enabled = false)
	
	public void testB() {
		System.out.println("Test Case 2");
	}
	

	
	
}
