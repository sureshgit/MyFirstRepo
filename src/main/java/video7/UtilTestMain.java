package video7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilTestMain {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login/?hsCtaTracking=d82c5d82-821c-4c0d-86f5-6c34dced0e6d%7C16494015-d90f-47fc-adc3-593e2e1bdfa0");
		Thread.sleep(5000);
		
		
		By username=By.id("username");
		By password=By.id("password");
		By loginBtn=By.id("loginBtn");
		
		UtilPractice up=new UtilPractice(driver);
		/**
		up.getElement(username).sendKeys("suresh@gmail.com");
		up.getElement(password).sendKeys("sdkada");
		up.getElement(loginBtn).click();
		**/
		
		up.doSendKeys(username, "sures1h@gmail.com");
		up.doSendKeys(password, "sures9898");
		up.doClick(loginBtn);
	}

}
