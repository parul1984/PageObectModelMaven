package Base;

import org.testng.annotations.AfterSuite;

public class TestBase {
	
	@AfterSuite
	
	public void tearDown()
	{
		Page.quit();
		
	}
	

}
