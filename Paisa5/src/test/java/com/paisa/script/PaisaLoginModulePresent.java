package com.paisa.script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.paisa.help.SupportScript;
import com.paisa.page.Login;

public class PaisaLoginModulePresent extends SupportScript
{
	@Test(priority=2)
	public void testPaisaLoginButtonPresent()
	{
		Login lg = new com.paisa.page.Login();
		
		try
		{
			Assert.assertTrue(lg.checkLoginButtonIsPresent());
			Reporter.log("PaisaLoginModulePresent is pass",true);
		}
		catch(Exception e)
		{
			
		}
	}
}
