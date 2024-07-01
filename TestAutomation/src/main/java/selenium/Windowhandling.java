package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	
	public static void main(String[] args) {
		
		
       ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		
		 String homepage = driver.getWindowHandle();
		
	     System.out.println(homepage);
		
		
		
		driver.findElement(By.xpath("(//span[contains(text(),'Open')])[1]")).click();
		
         Set<String> allwindows = driver.getWindowHandles();
		
		for (String newwindow : allwindows) {
			
			driver.switchTo().window(newwindow);
			
			
			
		}
	
		driver.findElement(By.id("email")).sendKeys("vigneshkandiah@gmail.com");
		
		driver.switchTo().window(homepage);
		
	driver.findElement(By.xpath("//span[contains(text(),'Open Multiple')]")).click();
		
		Set<String> multipletaps = driver.getWindowHandles();
		
		for (String string : multipletaps) {
			
			System.out.println(string);
			
		if(!string.equals(homepage)) {
			
			driver.switchTo().window(string).close();
			
//		driver.switchTo().defaultContent();
//			
//		}
//		}
//		
//		
//		
//	
}
	}
}
}
