package com.testNG.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextNG_Practice {

	//before
	//test
	//after
	
	WebDriver driver;
	
	By username=By.id("username");
	By password=By.id("password");
	By login=By.id("loginBtn");
	By signup=By.linkText("Sign up");
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
        driver.get("https://app.hubspot.com/login");
       
		
		
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
	}
	
	
	@Test(priority=1)
	public void signup()
	{
		
		Assert.assertTrue(driver.findElement(signup).isDisplayed());  
	}
	
	@Test(priority=2)
	public void pageTitle()
	{
		String title =driver.getTitle();
		System.out.println("page title is "+ title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=3)
	public void LoginPage()
	{
		driver.findElement(username).sendKeys("suresh@gmail.com");
		driver.findElement(password).sendKeys("suresh");
		driver.findElement(login).click();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
