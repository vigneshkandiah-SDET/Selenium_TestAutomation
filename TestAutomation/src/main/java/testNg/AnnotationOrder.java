package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrder {
	
	@Test
	public void testcreatelead() {

		System.out.println("@Test:createlead");
	}
	
	@Test
	public void testeditlead() {

		System.out.println("@Test:editlead");
	}

	@BeforeSuite
	public void beforesuite() {

		System.out.println("@BeforeSuite");
	}

    @BeforeTest
	public void beforetest() {

		System.out.println("@BeforeTest");
	}

    @BeforeClass
	public void beforeclass() {

		System.out.println("@BeforeClass");
	}
    @BeforeMethod
    public void beforeMethod() {

		System.out.println("@BeforeMethod");
	}
    

    @AfterMethod
	public void afterMethod() {

		System.out.println("@AfterMethod");
	}

    @AfterClass
	public void afterclass() {

		System.out.println("@AfterClass");
	}

    @AfterTest
	public void afterTest() {

		System.out.println("@AfterTest");
	}
    @AfterSuite
	public void aftersuite() {

		System.out.println("@AfterSuite");
	}

}
