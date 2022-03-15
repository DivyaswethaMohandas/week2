package week2.day2.assignment1;

import java.time.Duration;

import org.apache.poi.ss.formula.functions.Sumproduct;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Divya");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567891"); 
		driver.findElement(By.name("reg_passwd__")).sendKeys("D12345@!123");
	WebElement element1 = driver.findElement(By.id("day"));
	Select d1=new Select(element1);
	d1.selectByVisibleText("18");
	
	WebElement element2 = driver.findElement(By.id("month"));
	Select d2=new Select(element2);	
	d2.selectByVisibleText("Feb");
	
	WebElement element3 = driver.findElement(By.id("year"));//new
	Select d3=new Select(element3);
	d3.selectByVisibleText("1998");
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	System.out.println("Entered all the Required Details");
	//	driver.close();	
	

	}

}
