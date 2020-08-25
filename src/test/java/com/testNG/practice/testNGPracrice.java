package com.testNG.practice;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class testNGPracrice {
	
	WebDriver driver;
	
	public void setup()
	{
		driver=new ChromeDriver();
		WebDriverManager driver=new WebDriverManager() {
			
			@Override
			protected void setDriverVersion(String driverVersion) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			protected void setDriverUrl(URL url) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			protected void setBrowserVersion(String browserVersion) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			protected Optional<URL> getMirrorUrl() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			protected Optional<String> getExportParameter() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			protected String getDriverVersion() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			protected List<URL> getDriverUrls() throws IOException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			protected URL getDriverUrl() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			protected String getDriverName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public DriverManagerType getDriverManagerType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			protected Optional<String> getBrowserVersionFromTheShell() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			protected String getBrowserVersion() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	

}
