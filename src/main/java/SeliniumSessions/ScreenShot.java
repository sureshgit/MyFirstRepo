package SeliniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://app.hubspot.com/login/?hsCtaTracking=d82c5d82-821c-4c0d-86f5-6c34dced0e6d%7C16494015-d90f-47fc-adc3-593e2e1bdfa0&__cf_chl_jschl_tk__=8af9e4a0192dd51c5948aebf3ae3343057a629f1-1596817344-0-AfK-6k0UyMPG-djoHqIihZ0_zT1s0fIYrnbekjqPP2duJp_NpfXHOmfw8mm0YKqdfEf39oPNmZEd4t1QoiZUmJfPh6SS-1nPuZRV6hZj7ie1ZQTzEK6GrVLfHoLZgV5p7iYPg66uVsQjPt-sb_ulXdAVepPg4J4EYov-sDB5D352ktW1eajrJxCRvngeTwr1bl-XtdFDh0jAD6s8rc1y1nRm3h6vdSKybzUbvm4DhdsWTI_gmUOmCxiSY5rx0tzjlG43cDMTI42ql-xKmbWAeI55vqPoEuGSdfNBQW8NzPp51sVlhtzq6_xv98wmkbfVgeOGFFpGgI97QIhspt5YBwH4GmpYr7Sd5vGzjtDQitjssLnE6Ir2tRnCU4bAghc2eEvTkOJiY_2YytU9JGcgbxGsR8o51e-D06AlDzUYkht2_d1PzN78jFUqU9uwAZlVDLTALumqLJsLcZz-Rym_7Ts");//launching the web site

		Thread.sleep(5000);
		
			
		File Srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Srcfile, new File("./target/screenshots/page.png"));

		WebElement email=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		
		takeScreenshotElement(email, "email");
		takeScreenshotElement(password, "password");
		
		takeScreenshot(driver, "jjkhj");
		
		driver.quit();
		
		
	}

	
	public static void takeScreenshot(WebDriver driver,String fileName)
	{
		File Srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Srcfile, new File("./target/screenshots/fileName.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void takeScreenshotElement(WebElement element,String fileName)
	{
		File Srcfile=((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Srcfile, new File("./target/screenshots/fileName.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
