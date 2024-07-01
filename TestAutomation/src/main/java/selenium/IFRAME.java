package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME {
	
	
	public static void main(String[] args) {
		
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.switchTo().frame("frame1");
		
		String text = driver.findElement(By.xpath("//p[contains(text(),'Child')]")).getText();
		
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		String text2 = driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]")).getText();
		
		System.out.println(text2);
	}

}
