package SeliniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTotalTestFields {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		/**
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("Total Count for Input type=text = "  + list.size());
		for(int i =0;i<list.size();i++)
		{
			list.get(i).sendKeys("suresh");
			//list.get(i).sendKeys("suresh");
			//System.out.println(list.get(i));
			
		}
		*/
		List<WebElement> imageList=driver.findElements(By.tagName("img"));
		System.out.println(imageList.size());
		
		
		
		
		for (int i =0;i<imageList.size();i++)
		{
			String imageurls= imageList.get(i).getAttribute("src");
			System.out.println("count "+ imageurls);
			
			
			
			if(imageurls.equals("https://images-eu.ssl-images-amazon.com/images/G/31/img19/AmazonPay/Boson/Sid/Covid/Donation_186x116._SY116_CB435243930_.jpg"));
			{
				System.out.println("got url");
			}
			
			
		
		}
		
	}

}
