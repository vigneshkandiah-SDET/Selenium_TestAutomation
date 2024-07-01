package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='I am here']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		System.out.println(ele.getText());
		
		driver.findElement(By.xpath("(//button[@role='button']//span)[3]")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		
		
		
		
		
		
		
		
	}

}
