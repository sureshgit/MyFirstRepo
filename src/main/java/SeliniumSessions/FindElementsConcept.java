package SeliniumSessions;

import java.util.List;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();//launch browser.
		driver.get("https://www.amazon.in/");
		
		List<WebElement> list=driver.findElements(By.tagName("a"));//	used for finding multiple similar kind of  elements and it returns list of webelements 
		System.out.println("............."+list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String test=list.get(i).getText();
			System.out.println("".trim());
			System.out.println(test);
		
			
			if(test.equals(null))
			{
				System.out.println(test.trim());
				
				
			}
			
			
		}
		
	}

}
