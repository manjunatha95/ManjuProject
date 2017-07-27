package com.mail.script;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Gdrive 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://drive.google.com");
		driver.findElement(By.linkText("Go to Google Drive")).click();
		driver.findElement(By.id("identifierId")).sendKeys("samsyst.testers.001");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys("sam1234$");
		driver.findElement(By.id("passwordNext")).click();
		
		WebElement fld = driver.findElement(By.xpath("//span[text()='Sam']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(fld).perform();
		a1.doubleClick().perform();
		
		driver.findElement(By.xpath("//button[@guidedhelpid='new_menu_button']")).click();
		driver.findElement(By.xpath("//div[text()='File upload']")).click();
		
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
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		System.out.println("end");
	}

}
