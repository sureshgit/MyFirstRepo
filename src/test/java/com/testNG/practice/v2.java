package com.testNG.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class v2 {

	@Test(priority=1)
		public void login()
		{
			System.out.println("This is Login");
		}
	@Test(priority=2)
	public void homePage()
	{
		System.out.println("This is homePage");
		int i=9/0;
	}
	@Test(priority=3,dependsOnMethods="homePage")
	public void Search()
	{
		System.out.println("this is searach");
	}
	}

