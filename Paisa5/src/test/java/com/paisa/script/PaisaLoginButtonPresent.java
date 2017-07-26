package com.paisa.script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.paisa.help.SupportScript;
import com.paisa.page.Login;

public class PaisaLoginButtonPresent extends SupportScript
{
	@Test(priority=6)
	public void testPaisaLoginButtonPresent()
	{
		Login lg = new Login();
		//lg.clickOnLogin();
		try
		{
			Assert.assertTrue(lg.checkLoginButtonIsPresent());
			Reporter.log("PaisaLoginButtonPresent pass", true);
		}
		catch(Exception e)
		{
			
		}
	}
}
