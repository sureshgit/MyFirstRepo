package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingV5 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");//launching the web site
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		//Select selectDayDropDown=new Select(day);
		//selectDayDropDown.selectByVisibleText("16");
		
		//Select selectmonthDropDown=new Select(month);
		//selectDayDropDown.selectByIndex(11);
		
		//Select selectYearDropDown=new Select(year);
			//	selectYearDropDown.selectByIndex(1989);
		
		
		
		//Select selectMonthDropDown=new Select(month);
		//selectMonthDropDown.selectByVisibleText("May");
		
		//Select selectYearDropDown=new Select(year);
		//selectYearDropDown.selectByVisibleText("2020");
		
		//selectDropDownAll(day,"15");
		//selectDropDownAll(month,"Jun");
		//selectDropDownAll(year,"1989");
		
		
		selectDropDownAllByIndex(day,16);
		selectDropDownAllByIndex(month,10);
		selectDropDownAllByIndex(year,23);
		
	}
	/**
	 * This method is used to select the value from a drop down on the basis of given text.
	 * @param element
	 * @param value
	 */
	public static void selectDropDownAll(WebElement element,String value )
	{
		Select select=new Select(element);
		select.selectByVisibleText(value);
		
		
	}
	/**
	 * This method is used to select the value from a drop down on the basis of given index
	 * @param element
	 * @param value
	 */
	public static void selectDropDownAllByIndex(WebElement element,int value)
	{
		Select select=new Select(element);
		select.selectByIndex(value);
	}
	

}
