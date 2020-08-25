package video7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

	WebDriver driver ;
	
	public Util(WebDriver driver) {
		this.driver=driver; 
		
	}
	/**
	 * This is used to create the webelement on the basis of by locator 
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator)
	{
		WebElement element=null;
		try
		{
		 element=driver.findElement(locator);
		}
		catch(Exception e)
		{
			System.out.println("some exception occured while creating a webelement");
			System.out.println(e.getMessage());
		}
		
		return element;
		
	}
	/**
	 * used for cliking 
	 * @param locator
	 */
	public void doClick(By locator)
	{
		try {
		getElement(locator).click();
		
	}catch(Exception e){
		System.out.println("some exceptiom occured ");
		System.out.println(e.getMessage());
	}
		
	}
	/**
	 * just dosendkey
	 * @param locator
	 * @param value
	 */
	public void doSendKey(By locator ,String value)
	{try {
		getElement(locator).sendKeys(value);
	}catch(Exception e){
		System.out.println("some exceptiom occured ");
		System.out.println(e.getMessage());
	}
	}
	
	
}
