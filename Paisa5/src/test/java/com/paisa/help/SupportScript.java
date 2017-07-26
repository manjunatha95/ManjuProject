package com.paisa.help;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class SupportScript 
{
	public static WebDriver driver;
	
	@BeforeTest
	public void browserSet()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.5paisa.com");
	}
	
	@BeforeClass
	public void openApp()
	{
		
	}
	
}
