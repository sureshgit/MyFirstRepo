package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		/**
		Select select1=new Select(day);
		select1.selectByVisibleText("15");
		
		Select select2 =new Select(month);
		select2.selectByVisibleText("06");
		
		Select select3=new Select(year);
		select3.deselectByVisibleText("2020");
*/
		dropDownSelect(day,"10");
		dropDownSelect(month,"May");
		dropDownSelect(year,"2020");
		
		
	}
	
	
	public static  void dropDownSelect(WebElement element,String Value)
	{
		Select select=new Select(element);
		select.selectByVisibleText(Value);
		
		
	}

}
