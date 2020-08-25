package SeliniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();//launch the browser 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(7000);
		driver.findElement(By.name("proceed")).click(); //click on login page
		Thread.sleep(7000);
		
		Alert alert=driver.switchTo().alert();//switching from webpage to popup page 
		String str=alert.getText(); //getting pop up msg
		System.out.println(str);
		if(str.equals("Please enter a valid user name"))
		{
			System.out.println("correct popup");
		}
		else
		{
			System.out.println("not correct");
		}
		
		alert.accept();//click ok on popup page 
		alert.dismiss();//cancel the alert
		//alert is response  for only javascript popup which is coming from alert java script methode .
		

}
}