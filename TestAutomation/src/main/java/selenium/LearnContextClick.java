package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnContextClick {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement rightclickelement = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(rightclickelement).perform();
		
		driver.findElement(By.xpath("(//li[contains(@class,'context-menu')])[1]/span")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
		
		
	}

}
