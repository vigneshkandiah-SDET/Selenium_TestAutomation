package testNg;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;



public class DependsOnMethod {
	
	
	@Test(description = "The Test Case Verifies Test 1")
	public void test1() {
		
		System.out.println("Test1");
		
		//Assert.fail("Test is Failed");
	}
	
	@Test(dependsOnMethods = "testNg.DependsOnMethod.test1",alwaysRun = true)
	public void test2() {
		
		System.out.println("Test2");
	}
	
	@Test()
	public void test3() {
		
		System.out.println("Test3");
	}

}
