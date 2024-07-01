package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenShot {




	public static void main(String[] args) throws IOException  {


		ChromeDriver driver = new ChromeDriver();


		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		File src = driver.getScreenshotAs(OutputType.FILE);

		File target = new File("./snap/img.png");



		FileUtils.copyFile(src, target);
		driver.findElement(By.className("decorativeSubmit")).click();





	}



}
