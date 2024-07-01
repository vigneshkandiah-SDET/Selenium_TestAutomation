package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {
	
	
	public static void main(String[] args) throws InterruptedException {
		
      ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement mensfashions = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
		
		Point location = mensfashions.getLocation();
		
		System.out.println(location);
		
		//Move to Element
		Actions action = new Actions(driver);
		
		action.moveToElement(mensfashions).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
		
		
	}

}
