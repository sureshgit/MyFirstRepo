package SeliniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//open the browser
		driver.get("https://www.facebook.com/");
		//System.out.println(driver.getTitle());
		String str=driver.getTitle();
		System.out.println(str);
		String s=driver.getCurrentUrl();
		System.out.println(s);
		//System.out.println(driver.getCurrentUrl());

		if(s.equals("https://www.facebook.com/"))
		{
			System.out.println("correct url");
		}
		else
		{
			System.out.println("wrong");
		}
		driver.getPageSource();
		//driver.quit();
		driver.close();
		driver.getTitle();
	}

}
