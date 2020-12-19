package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.HomePage;
import Utilities.TestUtils;

public class LoginTest extends TestBase {
	
 @Test  (dataProvider = "dp", dataProviderClass = TestUtils.class, alwaysRun = true)
 
	public void loginTest(String email, String password ) throws IOException
	{
       System.out.println("in the test class" + email + password);     	 
		HomePage home  = new HomePage();
		home.goToLogin().doLogin(email, password);
		Assert.fail("Forcefully Failed");
		
		//.gotoAccount().gotoCreateAccount().addAccountInfo("Parul", "ASDF");
		/*String email, String password
      (dataProvider = "data-provider", dataProviderClass = TestUtils.class, alwaysRun = true)
		*/
	}

}
