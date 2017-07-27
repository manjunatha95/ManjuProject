package com.mail.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckAttach 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.id("photo")).click();

	}

}
