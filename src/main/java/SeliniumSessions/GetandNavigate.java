package SeliniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetandNavigate {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//open the browser
		
		//driver.get("https://www.google.co.in/");
		//System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.co.in/");
		System.out.println(driver.getTitle());
	}

}
