package SeliniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//open the browser
		
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		System.out.println("refresh");
		
		//Diff bw of both
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.google.co.in/");
		
	}

}
