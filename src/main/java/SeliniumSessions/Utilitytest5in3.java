package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilitytest5in3 {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");//launching the web site
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		DropDownUtilityv53.getAllDropDownPrint(day);
		DropDownUtilityv53.getAllDropDownPrint(month);
		DropDownUtilityv53.getAllDropDownPrint(year);
		
		//DropDownUtilityv53 .selectDropDownAll(day, value);
		
	}

}
