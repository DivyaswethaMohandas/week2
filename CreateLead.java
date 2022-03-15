package week2.day1.assignment1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	private static List<WebElement> options;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); //first set the environment Setting Driver Environemt for Chrome Browser
		
		ChromeDriver driver = new ChromeDriver();//Opening the Browser		
		
		driver.get("http://leaftaps.com/opentaps/control/login");//Load the URL
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
  driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
  driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
  
  //create lead

  
  driver.findElement(By.linkText("Create Lead")).click();  
  
  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mindtree");
  WebElement element1 = driver.findElement(By.id("createLeadForm_firstName"));
  element1.sendKeys("Swetha");    
  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
  element1.clear();  
  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DIVYA");
  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("test");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("test12345");		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@12.com");
		//handle dropdown
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select obj1=new Select(dropdown1);
		 
		 obj1.selectByVisibleText("Illinois");
		
	//submit
		 driver.findElement(By.className("smallSubmit")).click();
		 String title=driver.getTitle();
		 System.out.println("Title of the page is "+title);
	}

}
