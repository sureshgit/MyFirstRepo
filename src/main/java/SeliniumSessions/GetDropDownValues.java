package SeliniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValues {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
		
	/**Select select1=new Select(day);
	List<WebElement>list=select1.getOptions();
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++)
	{
		String days=list.get(i).getText();
		System.out.println(days);
	}
	*/
		
		
		selectAllDropDown(day);
		selectAllDropDown(month);
		selectAllDropDown(year);
	}
	/**
	 * this is method is  used to get all the values from dropdown ...
	 * @param element
	 */
	public static  void selectAllDropDown(WebElement element )
	{
		System.out.println("===============================");
		Select select1=new Select( element);
		List<WebElement>dropList=select1.getOptions();
		System.out.println(dropList.size());
		
		for(int i=0;i<dropList.size();i++)
		{
			String text=dropList.get(i).getText();
			System.out.println(text);
		}
		}
		
		}
	


