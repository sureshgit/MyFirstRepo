package video7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilPractice {

WebDriver driver;

UtilPractice(WebDriver driver)
{
	this.driver=driver;
}

public WebElement getElement(By locator )
{
	WebElement element=null;

	try
{
	
element=driver.findElement(locator);
}catch(Exception e)
{
	System.out.println("this is exception while ");
	System.out.println(e.getMessage());
}
	return element;

}

public void doClick(By locator)
{
	try {
	getElement(locator).click();
}catch(Exception e)
	{
	System.out.println("slkajfdsldlkas");
	System.out.println(e.getMessage());
	}
}

public void doSendKeys(By locator,String value)
{
	try {
	getElement(locator).sendKeys(value);
		}catch(Exception e)
	{
			System.out.println("exception occred");
			System.out.println(e.getMessage());
	}


}
}