package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Base.Page;
import Pages.Accounts.CRMAccount;
import Pages.Accounts.CRMCreateAccount;

public class CRMhomePage extends Page {
	
	public CRMhomePage () throws IOException 
	{
		Page.wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.lyteMenuItems > div:nth-child(3) > a")));	
		
	}
	public void verifyAddSampleDataBtn()
	{
		
		
	}

	public void verifyTextCRMHome()
	{
		
	}
	
	public void gotoconnections()
	{
		menue.gotoContacts();
	}
	
	public CRMAccount gotoAccount() throws IOException
	{
		
		menue.gotoAccounts();
		return new CRMAccount();
		
	}
}
