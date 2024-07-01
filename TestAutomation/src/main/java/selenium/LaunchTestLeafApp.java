package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTestLeafApp {

	public static void main(String[] args) {
	
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.xpath("(//button[contains(text(),'Click Me')])[1]")).click();
		driver.switchTo().defaultContent();
		
		
		 List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		 
		 
		 
		 System.out.println(findElements.size());
		 
		 driver.switchTo().frame(2);
		 WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		 
		 driver.switchTo().frame(frame2);
		 
		
		 
		 
		 
		 
		 driver.findElement(By.xpath("(//button[contains(text(),'Click Me')])[1]")).click();
		 
		 driver.switchTo().defaultContent();
		 String text = driver.findElement(By.xpath("(//h5[contains(text(),'Click Me')])[1]")).getText();
		 
		 System.out.println(text);
		 
		 
		
		
		
		
		

	}

}
