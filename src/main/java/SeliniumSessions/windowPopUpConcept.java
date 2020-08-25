package SeliniumSessions;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowPopUpConcept {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Thread.sleep(5000);		
		 
		
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> it=handler.iterator();	
		
		String parentWindowId=it.next();		
		System.out.println("ParentId is :"+parentWindowId);
		
		String childwindow=it.next();
		System.out.println("childWindow:"+childwindow);
		
		driver.switchTo().window(childwindow);//switch to child window
		System.out.println(driver.getTitle());		
		driver.close();//close the child window pop up
		
		driver.switchTo().window(parentWindowId);//switch to parent window  
		System.out.println(driver.getTitle());		
		
		
		driver.close();//close the parent window pop up
		driver.quit();
	

	}

}
