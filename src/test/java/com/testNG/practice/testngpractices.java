package com.testNG.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngpractices {
	
	WebDriver driver;
	
	By username=By.id("username");
	By password=By.id("password");
	By login=By.id("loginBtn");
	By signup=By.linkText("Sign up");
	
	@BeforeMethod
	public void setup()
	
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	
	@Test(priority=1)
	public void getTitle()
	{
		String title =driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority=2)
	public void logIn()
	{
		driver.findElement(username).sendKeys("suresh@gmail.com");
		driver.findElement(password).sendKeys("suresh");
		driver.findElement(login).click();
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	

}
