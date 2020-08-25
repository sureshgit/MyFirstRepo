package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextRightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");//
		//Thread.sleep(4000);
		
		WebElement rightClick=driver.findElement(By.className("context-menu-one"));
		
		Actions action=new Actions(driver);
		action.contextClick(rightClick).build().perform();
		
		String text=driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-copy')]/span")).getText();
		System.out.println(text);
		
		String cutElement=driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-cut')]/span")).getText();
		System.out.println(cutElement);
		
		
		
	}
	

}
