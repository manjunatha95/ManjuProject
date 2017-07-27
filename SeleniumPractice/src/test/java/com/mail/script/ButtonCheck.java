package com.mail.script;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonCheck 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		setup();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@title='Search']")).clear();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java");
		driver.close();
		//driver.findElement(By.xpath("//button[@value='Search']")).click();
		
		/*try
		{
			Robot rob = new Robot();
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		System.out.println("end");
	}
	
	public static void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
