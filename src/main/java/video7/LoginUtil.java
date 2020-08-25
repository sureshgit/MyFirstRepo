	package video7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUtil {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login/?hsCtaTracking=d82c5d82-821c-4c0d-86f5-6c34dced0e6d%7C16494015-d90f-47fc-adc3-593e2e1bdfa0");
		Thread.sleep(5000);
		
		
		By username=By.id("username");
		By password=By.id("password");
		By loginBtn=By.id("loginBtn");
		
		Util u=new Util(driver);
		/**
		u.getElement(username).sendKeys("suresh@gmial.com");
		u.getElement(password).sendKeys("suresh");
		u.getElement(loginBtn).click();
		**/
		u.doSendKey(username, "uresh@gmial.com");
		u.doSendKey(password, "ureshialcom");
		u.doClick(loginBtn);
	
	}

}
