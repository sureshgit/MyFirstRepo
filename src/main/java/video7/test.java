package video7;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String,String> ma=new HashMap<String ,String>();
		ma.put("admin", "admin123");
		ma.put("patient", "suresh_123");
		ma.put("doctor", "sokspo_234");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys(ma.get("admin").split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(ma.get("admin").split("_")[0]);
		
		
	}

}
