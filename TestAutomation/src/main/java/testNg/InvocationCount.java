package testNg;

import java.time.Duration;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test(invocationCount = 3,invocationTimeOut = 1)
	public void test1() {
		
		System.out.println("Test1");
	}
	
	@Test()
	public void test2() {
		
		System.out.println("Test2");
	}
	
	@Test(invocationCount = 3,invocationTimeOut = 1)
	public void test3() {
		
		System.out.println("Test3");
	}

}
