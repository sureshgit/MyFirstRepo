package video8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://app.hubspot.com/login/?hsCtaTracking=d82c5d82-821c-4c0d-86f5-6c34dced0e6d%7C16494015-d90f-47fc-adc3-593e2e1bdfa0");//launching the web site
		
		WebDriverWait driver1=new WebDriverWait(driver,20);
		driver1.until(ExpectedConditions.titleContains("HubSpot"));
		
		System.out.println(driver.getTitle());
		
		By Email=	By.id("username");
		WebDriverWait wait  =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(Email));
		
		WebElement email1=driver.findElement(Email);
		email1.sendKeys("suresh@gmail.com");
		
		
	}
	
	public void getExplicitly( WebDriver driver, int  timeout,By locator)
	{
		
		WebDriverWait wait  =new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
		
	}
	
	public void getTitles(String title,int timeout)
	{
	//	WebDriverWait driver1=new WebDriverWait(driver,timeout);
		//driver1.until(ExpectedConditions.titleContains(title));
		
	//	System.out.println(driver.getTitle());
	}

}
