package SeliniumSessions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtilityv53 {
	

	/**
	 * This method is used to select the value from a drop down on the basis of given text.
	 * @param element
	 * @param value
	 */
	public static void selectDropDownAll(WebElement element,String value )
	{
		Select select=new Select(element);
		select.selectByVisibleText(value);
		
		
	}
	/**
	 * This method is used to select the value from a drop down on the basis of given text.
	 * @param element
	 * @param value
	 */
	public static void selectDropDownAllByIndex(WebElement element,int value)
	{
		Select select=new Select(element);
		select.selectByIndex(value);
	}
	

	/**
	 * used to getselect all values from drop down
	 * @param element
	 */
			public static void getAllDropDownPrint(WebElement element)
			{
				
				Select daySelect=new Select(element);	
				List<WebElement> droplist=daySelect.getOptions();
				System.out.println(droplist.size());
				
				//want print all drop down values 
				
				for(int i=0;i<droplist.size();i++)
				{
					String text=droplist.get(i).getText();
					
					System.out.println(text);
				}
			}

}


