package selenium;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtendReport {

	public static void main(String[] args) throws IOException {
	//1.set the path for ExtendHtmlReporter
		
		
		ExtentHtmlReporter er = new ExtentHtmlReporter("./reports/Extentreports.html");
		er.setAppendExisting(true);
		
	//2. create object for ExtentReports	
		ExtentReports repo = new ExtentReports();
		
	//3. Attach the ExtentReports to ExtentHtmlReporter
		repo.attachReporter(er);
		
	//4.Create Test name and description	
		ExtentTest test = repo.createTest("Login", "Login Positive Case");
		
		test.assignAuthor("Vignesh Kandiah");
		test.assignCategory("Smoke");
		
		test.pass("Enter the UserName", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/username.png").build());
		
		test.pass("Enter the Password",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/password.png").build());
		
		test.pass("Click the LoginButton",MediaEntityBuilder.createScreenCaptureFromPath("../snap/img1.png").build());
		
        ExtentTest test1 = repo.createTest("Login", "Login Positive Case");
		
		test1.assignAuthor("Vignesh Kandiah");
		test1.assignCategory("Sanity");
		
		test1.pass("Enter the UserName", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/username.png").build());
		
		test1.pass("Enter the Password",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/password.png").build());
		
		test1.fail("Click the LoginButton",MediaEntityBuilder.createScreenCaptureFromPath("../snap/img1.png").build());
		
		repo.flush();
		
		System.out.println("Report Generated ");
	}

}
