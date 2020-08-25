package SeliniumSessions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleV6 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		//driver.get("http://www.londonfreelance.org/courses/frames/index.html");//launching the web site
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		
		Actions action=new Actions(driver);
		
		WebElement conetentLink=driver.findElement(By.className("menulink"));
		
		action.moveToElement(conetentLink).build().perform();
		
		//WebElement frameElement=driver.findElement(By.name("main"));
		//driver.switchTo().frame(frameElement);
		
		//String str=driver.findElement(By.cssSelector("body > h2")).getText();
		//System.out.println(str);
		
		//driver.switchTo().defaultContent();//main window 
		//driver.switchTo().parentFrame();
		
		
		//WebElement frameElement=driver.findElement(By.tagName("frame"));
		
	

	}

}
