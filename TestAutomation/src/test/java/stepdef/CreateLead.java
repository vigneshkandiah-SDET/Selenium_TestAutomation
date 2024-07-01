package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
	
	
	
	@Given("the user clicks the crmsfa ,Leads and Create Lead link")
	public void clickLinks() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	}
	

	@Given("the user enter the Cname as {string}")
	public void enterCname(String Cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
		
	}

	@Given("the user enter the FName as {string}")
	public void enterFname(String FName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FName);
		
	}

	@Given("the user enter the Lname as {string}")
	public void enterLName(String Lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		 
	}

	@Given("the user enter the PhoneNumber as {string}")
	public void enterPhoneNumber(String PhoneNumber) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhoneNumber);
	}

	@When("the user clicks the CreateLead button")
	public void clickCreate() {
		driver.findElement(By.name("submitButton")).click(); 
	}

	@Then("verify the lead is created")
	public void verify_the_lead_is_created() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}


}
