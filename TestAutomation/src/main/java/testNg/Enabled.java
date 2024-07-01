package testNg;

import org.testng.annotations.Test;

public class Enabled {
	
	@Test(enabled=false)
	public void test1() {
		
		System.out.println("Test1");
	}
	
	@Test()
	public void test2() {
		
		System.out.println("Test2");
	}
	
	@Test(enabled=false)
	public void test3() {
		
		System.out.println("Test3");
	}

}
