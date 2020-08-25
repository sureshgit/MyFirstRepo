package video8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConcept {

	public static void main(String[] args)  {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://app.hubspot.com/login/?hsCtaTracking=d82c5d82-821c-4c0d-86f5-6c34dced0e6d%7C16494015-d90f-47fc-adc3-593e2e1bdfa0");
		
			//WebElement email=driver.findElement(By.id("username"));
			//email.sendKeys("suresh@gmail.com");
			
			
			
			//Actions action=new Actions(driver);
			//action.sendKeys("suresh@gmail.com").build().perform();
			
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebDriverWait wait1=new WebDriverWait(driver,20);
			wait1.until(ExpectedConditions.titleContains("HubSpot"));
			
			System.out.println(driver.getTitle());
			
			
			
			By id =By.id("username");
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(id));
			
			WebElement email=driver.findElement(id);
			email.sendKeys("suresh@gmail.com");
			

	}

}
