package SeliniumSessions;

import java.util.Set;


import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Thread.sleep(5000);

		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> itr =handles.iterator();
		String parent=itr.next();		
		System.out.println("parent parent"  +parent);
		
		
		String child=itr.next();		
		System.out.println(" child"  +child);
		
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		
		//driver.findElement(By.linkText("Good PopUp #1")).click();
		//driver.findElement(By.linkText("Good PopUp #2")).click();
		//Set<String> handles2=driver.getWindowHandles();
Set<String> handles2=driver.getWindowHandles();
		
		//Iterator<String> itr2 =handles.iterator();
		String child2=itr.next();		
		System.out.println("child2"  +child2);
		
		driver.switchTo().window(child2);
		
		System.out.println("second child"+ driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parent);
		
		driver.close();
		
		
		
		
		
	
		
	}

}
