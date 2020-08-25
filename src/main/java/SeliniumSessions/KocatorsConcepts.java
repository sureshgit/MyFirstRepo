package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KocatorsConcepts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//open the browser
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		/**
		WebElement email =driver.findElement(By.id("username")); //created webelement 
		email.sendKeys("msuresh5226@gmail.com"); //giving value to webelement
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("sresh123");
	*/
	driver.findElement(By.id("username")).sendKeys("msuresh5226@gmail.com");
	driver.findElement(By.id("password")).sendKeys("sresh123");
	driver.findElement(By.id("loginBtn")).click();
	//WebElement loginbotton =driver.findElement(By.id("loginBtn"));
	//loginbutton.click();
}
}
