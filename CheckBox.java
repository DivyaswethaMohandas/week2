package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
ChromeDriver driver = new ChromeDriver();//Opening the Browser		
		
		driver.get("http://leafground.com/pages/checkbox.html");//Load the URL
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		boolean selected1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		System.out.println(selected1);
		
		boolean selected2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
		System.out.println(selected2);
		
		
		boolean selected3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected();
		System.out.println(selected3);
		
		boolean selected4 = driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).isSelected();
		System.out.println(selected4);
		
		
	}

}
