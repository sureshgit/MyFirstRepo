package com.testNG.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		 
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1 ");
	}
	
	
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);  //explicitly wait is for only all elements  like title also 
		wait.until(ExpectedConditions.titleContains("Amazon Sign In"));
		//Assert.assertEquals(title, "HubSpot");// expected [HubSpot] but found [HubSpot Login]
		
		String title=driver.getTitle();
		System.out.println(title);		
		
		Assert.assertEquals(title, "Amazon Sign In");	
	}
	
	@Test(priority=3)
	public void LoginTest()
	{
		driver.findElement(By.name("email")).sendKeys("msuresh7676@gmail.com");		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.name("password")).sendKeys("10vv1f0006");
		driver.findElement(By.id("signInSubmit")).click();
	}
	
	
	@Test(priority=2)
	public void signUpLinkTest()
	{
	//boolean flag=driver.findElement(By.linkText("Privacy Notice")).isDisplayed();
	Assert.assertTrue(driver.findElement(By.linkText("Privacy Notice")).isDisplayed() , "signuplink is no ");	
	
	//String text=driver.findElement(By.linkText("Privacy Notice")).getText();
	
//	System.out.println("notice test"+ text);
//	System.out.println("sjdasjdasjodsa"+ driver.findElement(By.linkText("Privacy Notice")).getText());
	
	
		
	}

	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
}
