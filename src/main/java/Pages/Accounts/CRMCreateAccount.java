package Pages.Accounts;

import java.io.IOException;

import org.openqa.selenium.By;

import Base.Page;

public class CRMCreateAccount   extends Page {
	
	//input.textField[data-name='Account Name']
	//input.textField[data-name='Account Site']
	//input.textField[data-name='Parent Account']
	//input.textField[data-name='Account Number']
	//select#Crm_Accounts_ACCOUNTTYPE 
	
	
	public CRMCreateAccount() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addAccountInfo(String accountName, String accountSite)
	
	{
		
		type("AccountName_css" , accountName);
		type("AccountSite_css" , accountSite);
		click("save_css");
          /* driver.findElement(By.cssSelector("input.textField[data-name='Account Name']")).sendKeys(accountName);
           driver.findElement(By.cssSelector("input.textField[data-name='Account Site']")).sendKeys(accountSite);
           driver.findElement(By.cssSelector("input[name='save']")).click();
           */
          // return new CRMAccount ();
		
	}

}
