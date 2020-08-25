package SeliniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> listofDay=driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(listofDay.size());
		
		for(int i=0;i<listofDay.size();i++)
		{
			String text=listofDay.get(i).getText();
			System.out.println(text);
			
			if(text.equals("25"))
			{
				listofDay.get(i).click();
				break;
			}
		}
		
		
	}

}
