package SeliniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocator {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();//open the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();	
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		/**WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("suresh@gmail.com");
				
		WebElement password=driver.findElement(By.xpath("//*[@id='pass']"));
		password.sendKeys("suresh123");
		
		WebElement login=driver.findElement(By.xpath("//*[@id='u_0_b']"));
		login.click();*/
		
		//4:class name locator :class name should be unique then we can achieve class name 
		//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("surest@gmail.com");
		//driver.findElement(By.className("inputtext login_form_input_box"))
		//driver.findElement(By.linkText("Forgotten account?")).click();	
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Accept")).click();
		
		
		//driver.findElement(By.id("uid-firstName-5")).sendKeys("surehs");
		
		WebElement firstname=driver.findElement(By.id("uid-firstName-5"));
		firstname.sendKeys("suresh");
		
		WebElement lastname=driver.findElement(By.id("uid-lastName-6"));
		lastname.sendKeys("mandla");
		
		WebElement email=driver.findElement(By.id("uid-email-7"));
		email.sendKeys("suresh@gmail.com");
		
		//driver.findElement(By.))
		
		
		

	}

}
