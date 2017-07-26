package com.paisa.script;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.paisa.help.SupportScript;
import com.paisa.page.Login;

public class PaisaLoginPopup extends SupportScript
{
	@Test(priority=3)
	public void testPaisaLoginPopup()
	{
		Login lg = new Login();
		
		lg.clickOnLogin();
		try
		{
			driver.findElement(By.className("login-popup"));
	
			Reporter.log("PaisaLoginPopup is pass", true);
		}
		catch(Exception e)
		{
			Reporter.log("No login popup", true);
		}
		
	}
}
