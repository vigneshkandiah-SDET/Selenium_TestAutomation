package javaPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumException {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
			driver.findElement(By.id("Username")).sendKeys("Demosalesmanager");
		}catch(Exception e) {
			System.out.println(e);
			
		} finally {
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		}
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}

}
