package com.paisa.script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.paisa.help.SupportScript;
import com.paisa.page.Login;

public class PaisaLoginPasswordEnable extends SupportScript
{
	@Test(priority=5)
	public void testPaisaLoginPasswordEnable()
	{
		Login lg = new Login();
		//lg.clickOnLogin();
		try
		{
			Assert.assertTrue(lg.checkPasswordEnabled());
			Reporter.log("PaisaLoginPasswordPresent pass", true);
		}
		catch(Exception e)
		{
			
		}
	}
}
