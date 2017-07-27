package com.mail.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attaching 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		setup();
		openGmail();
		login("samsyst.testers.001@gmail.com","sam1234$");
		attach();
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
	
	public static void attach()
	{
		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Attach files']")).sendKeys("E:\\Workspace\\SeleniumPractice\\TestData\\estresult.xlsx");
	}
	

}
