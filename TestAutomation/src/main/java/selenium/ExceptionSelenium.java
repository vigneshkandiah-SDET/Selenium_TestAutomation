package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionSelenium {

	public static void main(String[] args) {
		
		
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
			driver.findElement(By.xpath("(//span[text()='ClickMe'])[1]")).click();
		} catch (Exception e) {
			
			System.out.println("The element you are trying to clcik with xpath (//span[text()='ClickMe'])[1] is not in the dom ");
			
		}finally {
			
			driver.close();
			
		}

		System.out.println("");
	}

}
