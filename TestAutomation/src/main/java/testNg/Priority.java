package testNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Priority {
	
	
	@Test(priority=3)
	public void test1() {
		
		System.out.println("Test1");
	}
	
	@Test(priority=-2)
	public void test2() {
		
		System.out.println("Test2");
	}
	
	@Test()
	public void test3() {
		
		System.out.println("Test3");
	}
	
	
}
