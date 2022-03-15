package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();//Opening the Browser		
				
				driver.get("http://leafground.com/pages/Edit.html");//Load the URL
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				boolean enabled1 = driver.findElement(By.name("username")).isEnabled();
				System.out.println(enabled1);
				
				boolean enabled2 = driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
				System.out.println(enabled2);
				driver.close();
	}

}
