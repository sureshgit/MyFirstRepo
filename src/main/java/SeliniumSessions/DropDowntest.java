package SeliniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowntest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		/**
		WebElement day=driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));
		
		ArrayList<String> months=DropDownUtiliy .selectAllDropDown(month);
		System.out.println(months);
		
		ArrayList<String> dayList=DropDownUtiliy .selectAllDropDown(day);
		System.out.println(dayList);
		
		ArrayList<String> yearList=DropDownUtiliy .selectAllDropDown(year);
		System.out.println(yearList);
		String date="20-Jul-2020";
		String dateVla[]=date.split("-");
		
		DropDownUtiliy.dropDownSelect(day,dateVla[0]);
		DropDownUtiliy.dropDownSelect(month,dateVla[1]);
		DropDownUtiliy.dropDownSelect(year,dateVla[2]);
		
		
		String day1="//select[@id='day']/option";
		String month1="//select[@id='month']/option";
		String year1="//select[@id='year']/option";
		
		DropDownUtiliy.selectDropDownValuesWithOutSelect(driver, "day", "14");
		DropDownUtiliy.selectDropDownValuesWithOutSelect(driver, "month", "May" );
		DropDownUtiliy.selectDropDownValuesWithOutSelect(driver, "year", "2020");
		
		DropDownUtiliy.getDropDownList(day);
		
		
		System.out.println("=================================================");
		
		DropDownUtiliy.getDropDownList(month);
		
		System.out.println("=================================================");
		
		DropDownUtiliy.getDropDownList(year);
		*/
		
		DropDownUtiliy.getTextValue(driver, "login1", "suresh","mandlka");
		
		
	}
	
	}


