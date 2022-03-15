package week2.day2.assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup(); //first set the environment Setting Driver Environemt for Chrome Browser
		
		ChromeDriver driver = new ChromeDriver();//Opening the Browser		
		
		driver.get("http://leaftaps.com/opentaps/control/login");//Load the URL
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
  driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
  driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
  
  driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Find Leads")).click();
 
  WebElement el1 = driver.findElement(By.xpath("//span[text()='Phone']"));
  el1.click();
 driver.findElement(By.name("phoneNumber")).sendKeys("1234");
  driver.findElement(By.linkText("Find Leads")).click();
  Thread.sleep(2000);
  String leadId = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a)[1]")).getText();  
  System.out.println(leadId);
   driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
  driver.findElement(By.linkText("Delete")).click();
  driver.findElement(By.linkText("Find Leads")).click();
  driver.findElement(By.name("id")).sendKeys( leadId );
   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
   Thread.sleep(2000);
   String norecord = driver.findElement(By.className("x-paging-info")).getText();
   System.out.println(norecord);
   if(norecord.equals("No records to display")) {
	   System.out.println("Record Deleted");
   }
   else {
	   System.out.println("Not deleted");
   }
   
//  		Capture lead ID of First Resulting lead
//	12	Click First Resulting lead
//	13	Click Delete
//	14	Click Find leads
//	15	Enter captured lead ID
//	16	Click find leads button
//	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
//	18	Close the browser (Do not log out)
  		
	}

}
