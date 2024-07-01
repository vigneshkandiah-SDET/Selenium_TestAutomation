package selenium;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReportsPractise {

	public static void main(String[] args) throws IOException {
		
		
		ExtentHtmlReporter er = new ExtentHtmlReporter("./reports/extentreports1.html");
		
		ExtentReports repo = new ExtentReports();
		
		repo.attachReporter(er);
		
		ExtentTest test = repo.createTest("Login", "LoginPositive");
		
		test.assignAuthor("Vignesh");
		test.assignCategory("Regression");
		
		test.pass("Enter userName", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/username.png").build());
		
		test.pass("Enter password", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/password.png").build());
		test.pass("Click Login", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img1.png").build());
		
		repo.flush();
		
		System.out.println("Report generated");
		
		

	}

}
