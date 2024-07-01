package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {
	
	
	public static void main(String[] args) throws IOException {
		
ChromeDriver driver = new ChromeDriver();


		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike Shoes",Keys.ENTER);
		
		
		
		//1. create a folder screenshot
		
		//2. File source =driver.getScreenshotAs(outputType.FILE)
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		//3. File target = new File("./screenshot/img.png");
		
		File target = new File("./screenshot/img.png");
		
		//4. Fileutils.copyFile(source,target);
		
		FileUtils.copyFile(source,target);
	}

}
