package com.mail.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Paisa 
{
	public static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.5paisa.com");
		try
		{
			driver.findElement(By.linkText("Login")).click();
			
			WebElement em =driver.findElement(By.id("login_UserName"));
			boolean b = em.isDisplayed();
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("end");
	}

}
