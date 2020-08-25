package completeExampleV07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogintUtil {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		
		By emailid=By.id("username");
		By password=By.id("password");
		By login=By.id("loginBtn");
		
		
		UtilPr util=new UtilPr(driver);
		//util.getElement(emailid).sendKeys("suresh@gmail.com");
		//util.getElement(password).sendKeys("suresh");
		//util.getElement(login).click();
		util.doSendKeys(emailid, "suresh@gmail.com");
		util.doSendKeys(password, "suresh");
		util.doClick(login);
		
	}

}
