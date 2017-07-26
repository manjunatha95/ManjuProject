package com.paisa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.paisa.help.SupportScript;

public class Login extends SupportScript
{
	@FindBy(linkText="Login")
	private WebElement loginMod;
	
	@FindBy(id="login_UserName")
	private WebElement email;
	
	@FindBy(id="login_Password")
	private WebElement password;
	
	@FindBy(id="ModalSubmit")
	private WebElement loginbutton;
	
	
	
	public Login()
	{
		PageFactory.initElements(SupportScript.driver, this);
	}
	
	public boolean checkLoginButtonIsPresent()
	{
		return loginMod.isDisplayed();
	}
	
	public boolean CheckLoginButtonEnabled()
	{
		return loginMod.isEnabled();
	}
	
	public void clickOnLogin()
	{
		loginMod.click();
	}
	
	
	
	public boolean checkEmailEnabled()
	{
		return email.isEnabled();
	}
	
	public void enterEmail(String mailID)
	{
		email.sendKeys(mailID);
	}
	
	
	
	public boolean checkPasswordEnabled()
	{
		return password.isEnabled();
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	
	public boolean checkLoginButtonPresent()
	{
		return loginbutton.isDisplayed();
	}
	
	public boolean loginButtonEnabled()
	{
		return loginbutton.isEnabled();
	}
	
	public void enterLogin()
	{
		loginbutton.click();
	}
}
