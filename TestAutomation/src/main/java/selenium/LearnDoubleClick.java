package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick {	
	
	
public static void main(String[] args) {
	
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	
	driver.switchTo().frame("iframeResult");
	WebElement textelement = driver.findElement(By.xpath("//p[contains(text(),'Double-click ')]"));
	
	Actions action = new Actions(driver);
	
	action.doubleClick(textelement).perform();
	
	driver.switchTo().defaultContent();
	
	
}

}
