package SeliniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();//launch browser.
		driver.get("https://www.facebook.com/");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		//System.out.println(dayList.size());
		
		Select select1=new Select(month);
		//select1.deselectByVisibleText("16");
		List<WebElement>listofdays=select1.getOptions();
		System.out.println(listofdays.size());
		
		for(int i=0;i<listofdays.size();i++)
		{
			String text=listofdays.get(i).getText();
			System.out.println((text));
		}
		
		
		
	}

}
