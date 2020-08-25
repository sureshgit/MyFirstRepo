package SeliniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class contextAssisgnment {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");//launching the web site

		Thread.sleep(4000);
		
		

		List<WebElement> rightClick=driver.findElements(By.className("context-menu-one"));

		getContextRightClick(driver,"right click me", "rss");
	}
	
	public static  void getContextRightClick(WebDriver driver,String locator ,String element )
	{
		
		WebElement rightClick=driver.findElement(By.className(locator));

		
		Actions action=new Actions(driver);
		action.contextClick().build().perform();
		
		String text=driver.findElement(By.xpath(locator)).getText();
		System.out.println("working");
		System.out.println(text);
		
	
	

}

}
