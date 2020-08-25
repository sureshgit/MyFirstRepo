package SeliniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverBasis {

public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();// Open The browser
driver.get("https://www.google.com/");//enter  the url
String title=driver.getTitle();
System.out.println(title);

if(title.equals("Google"))
{
	System.out.println("correct one");
}
else {
	System.out.println("wrong title");
}
String st1=driver.getCurrentUrl();
//System.out.println(driver.getPageSource());
System.out.println(st1);
//driver.quit(); // 
driver.close();  ///invalid session id
driver.getTitle();//NoSuchSessionException. Session ID is null
	}

}
