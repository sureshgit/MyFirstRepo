package SeliniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAllDropDownValuesV5in2 {

	public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");//launching the web site
			
			WebElement day=driver.findElement(By.id("day"));
			WebElement month=driver.findElement(By.id("month"));
			WebElement year=driver.findElement(By.id("year"));
			
			Select daySelect=new Select(day);	
			Select monthSelect=new Select(month);
			Select yearselect=new Select(year);
			
			getAllDropDownPrint(day);
			getAllDropDownPrint(month);
			getAllDropDownPrint(year);
			
		
	}
	/**
	 * used to getselect all values from drop down
	 * @param element
	 */
			public static void getAllDropDownPrint(WebElement element)
			{
				
				Select daySelect=new Select(element);	
				List<WebElement> droplist=daySelect.getOptions();
				System.out.println(droplist.size());
				
				//want print all drop down values 
				
				for(int i=0;i<droplist.size();i++)
				{
					String text=droplist.get(i).getText();
					
					System.out.println(text);
				}
			}

}
