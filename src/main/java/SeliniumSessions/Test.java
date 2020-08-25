package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
	
				
				driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
				
				
				Thread.sleep(5000);
				
				Actions action=new Actions(driver);
				
				WebElement conetentLink=driver.findElement(By.className("menulink"));
				
				
				
				action.moveToElement(conetentLink).build().perform();
				Thread.sleep(6000);
				
				driver.findElement(By.linkText("Courses")).click();
			
				
	}

}
