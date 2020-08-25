package completeExampleV07;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UtilPr {
	
	WebDriver driver;
	
	public UtilPr(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement getElement(By locator ) {
		WebElement element=null;
		try {
		 element=driver.findElement(locator);
		}
		catch(Exception e) {
			System.out.println("exception occur while finidng elelemt ");
			System.out.println(e.getMessage());
		}
		
		return element;
		
	}
	
	/**
	 * @methode is used for clikc the 
	 * @param locator
	 */
	public void doClick(By locator ) {
		try {
		getElement( locator).click();
		}
		catch(Exception e) {
			System.out.println("This is exception while clicking the ");
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @djlajda;ls
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator,String value)
	{
		try {
		getElement(locator).sendKeys(value);
		}
		catch(Exception e)
		{
			System.out.println("exception");
			System.out.println(e.getMessage());
		}
	}
	
	
	public void getAction(By locator,String value)
	{
		WebElement element=getElement(locator);
		Actions action=new Actions(driver);
		action.sendKeys(element, value).perform();
	}
	
	
	
	
	
}
