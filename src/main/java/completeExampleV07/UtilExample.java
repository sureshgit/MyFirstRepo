package completeExampleV07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

public class UtilExample {

	WebDriver driver;
	
	public UtilExample(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	/**
	 */
	public WebElement getElement(By locator ) {
		
		WebElement element = null;
		try {
		 element=driver.findElement(locator);
		}
		catch(Exception e) {
		System.out.println("some exception is coming while creating the webelement");		
		System.out.println(e.getMessage());
		}
		
		return element;
	}
	
	/**
	 * This method is used to pass the values in a web element
	 * @param locator
	 * @param value
	 */
	public void doClick(By locator )
	{
		try {
			getElement(locator).click();
		}
		catch(Exception e) {
			System.out.println("some exception may occur while passing value to the web element");
			System.out.println(e.getMessage());
			
		
		}
	}
	
	public void doSendKeys(By locator ,String value)
	{
		try
		{
		getElement(locator).sendKeys(value);
		}
		catch(Exception e)
		{
			System.out.println("exception occur while passing value to the element");
			System.out.println(e.getMessage());
		}
	}
	
	
	
}
