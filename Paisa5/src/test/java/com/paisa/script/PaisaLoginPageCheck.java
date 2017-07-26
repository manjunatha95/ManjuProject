package com.paisa.script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.paisa.help.SupportScript;

public class PaisaLoginPageCheck extends SupportScript
{
	@Test(priority=1)
	public void testPaisaLoginPageCheck()
	{
		String actualTitle = driver.getTitle();
		String expTitle = "Trade & Invest Online";
		try
		{
			Assert.assertTrue(actualTitle.startsWith(expTitle));
			Reporter.log("PaisaLoginPageCheck is pass", true);
		}
		catch(Exception e)
		{
			
		}
		
	}
}
