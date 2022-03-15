package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyerLinks {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();//Opening the Browser		
				
				driver.get("http://leafground.com/pages/Link.html");//Load the URL
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				String attribute1 = driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
				
				System.out.println(attribute1);
				String attribute2 = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
				
				System.out.println(attribute2);
				driver.close();
	}

}
