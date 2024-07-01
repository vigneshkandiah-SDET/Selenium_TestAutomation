package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolldown {
	
	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement aboutus = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		Actions action = new Actions(driver);
		
		action.scrollToElement(aboutus).perform();
		
		aboutus.click();
		
	}
	

}
