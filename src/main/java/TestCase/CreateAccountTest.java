package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CRMhomePage;
import Utilities.TestUtils;

public class CreateAccountTest {
	
	@Test  (dataProvider = "dp", dataProviderClass = TestUtils.class, alwaysRun = true)
	
	public void createAccountTest(String AccountName, String Account) throws IOException
	
	{
		
		CRMhomePage crmHomePage = new CRMhomePage();
		crmHomePage.gotoAccount().gotoCreateAccount().addAccountInfo(AccountName , Account);
		Assert.fail("Forcefully Failed");
		
	}

}
