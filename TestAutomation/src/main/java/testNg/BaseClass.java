package testNg;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.ReadExcelData;



public class BaseClass {
	
public  RemoteWebDriver driver;
public String excelFileName;
	
    @Parameters({"url","username","password","browser"})
	@BeforeMethod
	public void precondition(String url,String username,String password,String browser) {
		
    	if(browser.equalsIgnoreCase("chrome")) {
    		driver  = new ChromeDriver();
    		
    	}else if(browser.equalsIgnoreCase("firefox")) {
    		
    		FirefoxOptions options = new FirefoxOptions();
    		options.setProfile(new FirefoxProfile());
    		options.addPreference("dom.webnotifications.enabled", false);
    		
    		driver  = new FirefoxDriver(options);
    	}
    	
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@AfterMethod
	public void postconsition() {
		
		driver.close();
	}
	
	
	@DataProvider(name="sendata")
	public  String[][] sendData() throws IOException  {
		
		
		   String[][] array = ReadExcelData.readExcelData(excelFileName);
		   
		   return array;
		   
		   
		
		
		
//		String[][] array= new String[3][4];
//		
//		array[0][0]="Testleaf";
//		array[0][1]="Dilip";
//		array[0][2]="kumar";
//		array[0][3]="99";
//		
//		array[1][0]="Qeagle";
//		array[1][1]="vignesh";
//		array[1][2]="kandiah";
//		array[1][3]="98";
//		
//		array[2][0]="Accenture";
//		array[2][1]="vimal";
//		array[2][2]="murugesan";
//		array[2][3]="96";
//		
//		return array;
	}	
		
		
	

}
