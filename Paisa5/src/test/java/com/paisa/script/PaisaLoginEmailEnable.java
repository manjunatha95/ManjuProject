package com.paisa.script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.paisa.help.SupportScript;
import com.paisa.page.Login;

public class PaisaLoginEmailEnable extends SupportScript
{
	@Test(priority=4)
	public void testPaisaLoginEmailEnable()
	{
		Login lg = new Login();
		//lg.clickOnLogin();
		try
		{
			Assert.assertTrue(lg.checkEmailEnabled());
			Reporter.log("PaisaLoginEmailEnable is pass", true);
		}
		catch(Exception e)
		{
			
		}
	}
}
