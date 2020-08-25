package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utilityTest {
	/**
	 * this 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void getTextValue(WebDriver driver,String locator,String value )
	{
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id(locator)).sendKeys(value);
		String value1=driver.findElement(By.id(locator)).getAttribute(value);
		System.out.println(value1);

	}
	




}
