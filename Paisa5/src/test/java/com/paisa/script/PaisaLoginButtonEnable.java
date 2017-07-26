package com.paisa.script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.paisa.help.SupportScript;
import com.paisa.page.Login;

public class PaisaLoginButtonEnable extends SupportScript
{
	@Test(priority=7)
	public void testPaisaLoginButtonEnable()
	{
		Login lg = new Login();
		//lg.clickOnLogin();
		try
		{
			Assert.assertTrue(lg.checkLoginButtonIsPresent());
			Reporter.log("PaisaLoginButtonEnable pass", true);
		}
		catch(Exception e)
		{
			
		}
	}
}
