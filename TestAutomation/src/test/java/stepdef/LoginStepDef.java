package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.ProjectSpecificMethods;

public class LoginStepDef extends ProjectSpecificMethods {
	
	
//	@Given("The Leaftaps application is opened in browser")
//	public void launchBroswerwithLeaftaps() {
//		
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    
//	}

	
	
	
	@And ("The user enters the valid username as {string}")
	public void enterUserName(String username) {
		
		  
		driver.findElement(By.id("username")).sendKeys(username);
		
	}
	
	
	
	@And ("The user enters the valid password as {string}")
	
	public void enterPassword(String password) {
		
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When ("The user clicks the login button")
	
	public void clickLogin() {
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	
	@Then ("The user should be navigated to homepage")
	
	public void verifyHomePage() {
		
		String title = driver.getTitle();
		
		if(title.contains("Leaftaps")){
			System.out.println("Test passed :The User Navigated to HomePage");
			
		}else {
			
			System.out.println("Test failed:The User Not Navigated to HomePage");
		}
	
	}
	
	@When("The user should not be navigated to homepage")
	public void verifyError() {
		String title = driver.getTitle();
		
		if(!title.contains("Leaftaps")){
			System.out.println("Test passed: Throws Error");
			
		}else {
			
			System.out.println("Test failed:The User Navigated to HomePage");
		}
	    
	}

}
