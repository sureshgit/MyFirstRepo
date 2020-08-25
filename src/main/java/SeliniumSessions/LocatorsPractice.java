package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//open the browser
		driver.get("https://www.facebook.com/");
		
		WebElement  email=driver.findElement(By.name("email"));
		email.sendKeys("msuresh5226@gmail.com");
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("suresh123");
		
		WebElement login =driver.findElement(By.id("u_0_b"));
		login.click();
		
		
	}

}
