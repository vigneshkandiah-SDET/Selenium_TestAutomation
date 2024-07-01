package selenium;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsSelenium {

	public static void main(String[] args) throws IOException {
		
		//step 1: Create the report in html format using ExtentHtmlReporter class
		
		ExtentHtmlReporter er= new ExtentHtmlReporter("./reports/extentreporterpractise.html");
		
		// step 2. Create a ExtentReports class 
		ExtentReports repo = new ExtentReports();
		
		er.setAppendExisting(true);
		
		//step 3 attach the report to ExxtentReports class using its object
		repo.attachReporter(er);
		
		
		
		//4. Create a test with test name and description
		ExtentTest test = repo.createTest("Login", "Login Positive Flow");
		
	
		//5. Created a test step
		
		test.pass("Enter username", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/username.png").build());
		
		test.pass("Enter password", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/password.png").build());
		test.pass("Click Login", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img1.png").build());
		
		
		ExtentTest test1 = repo.createTest("Login", "Login Negative Flow");
		
		test.assignAuthor("Vignesh");
		test.assignCategory("regression");
		//5. Created a test step
		
		test1.pass("Enter username", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/username.png").build());
		
		test1.pass("Enter password", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/password.png").build());
		test1.fail("Click Login", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img1.png").build());
		
		test1.assignAuthor("Vimal");
		test1.assignCategory("Smoke");
		
		//5. Flush Report create
		repo.flush();
		
		System.out.println("Report Created");
		
		
		
		
		
		
		
		

	}

}
