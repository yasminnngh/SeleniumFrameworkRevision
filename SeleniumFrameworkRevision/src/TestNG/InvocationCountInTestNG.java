package TestNG;

import org.testng.annotations.Test;

public class InvocationCountInTestNG {

	@Test(priority = 0, invocationCount = 5)
	
	public void testA() {
		System.out.println("Test Case 1");
	}
	
	
	
	
}
