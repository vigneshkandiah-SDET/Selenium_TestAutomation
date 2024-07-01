package runner;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import cucumber.api.testng.AbstractTestNGCucumberTests;



public class ProjectSpecificMethods extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver;
	
	@BeforeMethod
	public void precondition() {
		
		  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	
	@AfterMethod
	public void postCondition() {
		
		driver.close();
		
		
		
	}

}
