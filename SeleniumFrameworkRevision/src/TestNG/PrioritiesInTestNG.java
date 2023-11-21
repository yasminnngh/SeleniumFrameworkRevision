package TestNG;

import org.testng.annotations.Test;

public class PrioritiesInTestNG {

	
	@Test(priority = -1)
	
	public void Atest() {
		System.out.println("Basic test");
	}
	
	@Test(priority = 0)
	
	public void test() {
		System.out.println("Test Case 1");
	}
	
	@Test(priority = -2)
	
	public void Btest() {
		System.out.println("Test Case 2");
	}
	
	@Test(priority = 2)
	
	public void Ctest() {
		System.out.println("Test Case 3");
	}
	
	
	@Test(priority = 2)
	
	public void Dtest() {
		System.out.println("Test Case 4");
	}
	
	
}
