package com.mail.script;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendMail 
{
    static WebDriver driver;
	public static void main(String[] args) 
	{
		setup();
		openGmail();
		login("samsyst.testers.001","sam1234$");
		sendMail("manjunatha95808@gmail.com","checkup");
		logout("samsyst.testers.001@gmail.com");
		System.out.println("end");
	}
	
	public static void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void openGmail()
	{	
		driver.get("https://www.gmail.com");
	}
	
	public static void login(String email,String pwd)
	{
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	
	public static void sendMail(String mail,String sub)
	{
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		driver.findElement(By.xpath("//input[@name='subjectbox']/../..//textarea[@name='to']")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(sub);
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Check the report attached");
		driver.findElement(By.xpath("//div[@aria-label='Attach files']")).click();
		
		
		String path = "E:\\Workspace\\SeleniumPractice\\TestData\\Testresult.xlsx";
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		try
		{
			Robot rob = new Robot();
			rob.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(1000);
			rob.keyPress(KeyEvent.VK_V);
			Thread.sleep(1000);
			rob.keyRelease(KeyEvent.VK_V);
			Thread.sleep(1000);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			rob.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			rob.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(15000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		driver.findElement(By.xpath("//div[text()='Send']")).click();
	}
	
	public static void logout(String mail)
	{
		driver.findElement(By.xpath("//a[contains(@title,'"+mail+"')]")).click();
		driver.close();
	}
	
}
