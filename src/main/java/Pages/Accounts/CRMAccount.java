package Pages.Accounts;

import java.io.IOException;

import org.openqa.selenium.By;

import Base.Page;

public class CRMAccount extends Page {
	
	public CRMAccount() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public CRMCreateAccount gotoCreateAccount() throws IOException
	{
		
		Page.click("create_css");
		//button.customPlusBtn
		//driver.findElement(By.cssSelector("button.customPlusBtn")).click();
		return new CRMCreateAccount();
		
	}

}
