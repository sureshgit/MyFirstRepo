package SeliniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtiliy {
	

	
	/**
	 * This is method is used to select the value from the a drop down on the basis of given text
	 * @param element
	 * @param Value
	 */
	public static  void dropDownSelect(WebElement element,String Value)
	{
		Select select=new Select(element);
		select.selectByVisibleText(Value);
		
		
	}
	/**
	 * This method is used to get all the values from drop down 
	 * @param element
	 */
	public static  ArrayList<String> selectAllDropDown(WebElement element )
	{
		
		System.out.println("===============================");
		Select select1=new Select( element);
		
		List<WebElement>dropList=select1.getOptions();
		ArrayList<String> al=new ArrayList<String>();
		System.out.println(dropList.size());
		
		
		for(int i=0;i<dropList.size();i++)
		{
			String text=dropList.get(i).getText();
			al.add(text);
			//System.out.println(text);
		}
		return al;
		}
	/**
	 * used to select the values from drop down without select class
	 * @param driver
	 * @param locator
	 * @param Value
	 */
	public static void selectDropDownValuesWithOutSelect(WebDriver driver, String locator,String value)
	{
		List<WebElement> dropList=driver.findElements(By.xpath(locator));
		System.out.println(dropList.size());
		
		for(int i=0;i<dropList.size();i++)
		{
			String text=dropList.get(i).getText();
			System.out.println(text);
			
			if(text.equals(value))
			{
				dropList.get(i).click();
				break;
			}
		}
	}
	
	
	/**
	 * this method is used select multiples values from the drop down
	 * @param element
	 */
	public static void getDropDownList(WebElement element)
	{

		Select select1=new Select(element);
		//select1.deselectByVisibleText("16");
		List<WebElement>listofdays=select1.getOptions();
		System.out.println(listofdays.size());
		
		for(int i=0;i<listofdays.size();i++)
		{
			String text=listofdays.get(i).getText();
			System.out.println((text));
		}
		
	}
	
	/**
	 * This method is used to get value from input field 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public static void getTextValue(WebDriver driver,String locator ,String value,String value1)
	{

		driver.findElement(By.id(locator)).sendKeys(value);
		String valuee1=driver.findElement(By.id(locator)).getAttribute(value);
		System.out.println("=========="+valuee1);

	}
	
	

}
