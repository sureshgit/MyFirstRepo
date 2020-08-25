package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileUploadPopUp {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\abc\\Downloads");
	//fileupload can be possible when (in inspect there is webelement attribute type=file should be there if not we should ask the developer to add attribute type =file 2 mins work)
	
	}

}
