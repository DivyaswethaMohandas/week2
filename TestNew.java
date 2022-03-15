package week2.day2.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNew {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup(); //first set the environment Setting Driver Environemt for Chrome Browser
		
		ChromeDriver driver = new ChromeDriver();//Opening the Browser		
		
		driver.get("https://acme-test.uipath.com/login");//Load the URL
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com"); //password
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title1 = driver.getTitle();
		System.out.println("Title of the page is " +title1);
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		
	}

}
