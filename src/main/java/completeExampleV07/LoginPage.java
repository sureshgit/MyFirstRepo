package completeExampleV07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		//these 3 by locators called page objects 
		By emailid=By.id("username");
		By password=By.id("password");
		By loginBtn=By.id("loginBtn");
		
		UtilExample util=new UtilExample(driver);
		//how will pass the driver from one class to another class? we have a constructor in utility class creating the object for utility class 
		//in other class and pass the driver and we have this key word  and what ever driver is coming to the global driver from globar driver 
		//will perform all actions 
		
		//util.getElement(emailid).sendKeys("suresh@gmail.com");
		//util.getElement(password).sendKeys("suresh");
		//util.getElement(loginBtn).click();
		
		util.doSendKeys(emailid, "suresh@gmail.com");
		util.doSendKeys(password, "suresh");
		util.doClick(loginBtn);
		
		

	}

}
