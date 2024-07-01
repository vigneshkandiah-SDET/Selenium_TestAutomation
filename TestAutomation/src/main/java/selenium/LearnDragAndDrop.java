package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {
	
	public static void main(String[] args) {
		
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		WebElement source = driver.findElement(By.id("form:drag_content"));
		
		WebElement target = driver.findElement(By.id("form:drop_header"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(source, target).perform();
		
		WebElement dragobject = driver.findElement(By.id("form:conpnl_header"));
		
		action.dragAndDropBy(dragobject, 170, 0).perform();
		
		
		
	}

}
