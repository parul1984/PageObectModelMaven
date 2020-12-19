package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Page;
import Pages.Accounts.CRMAccount;

public class Login extends Page{
	
	
//	
//	#login_id
//	.btn.blue
	
	public Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public CRMhomePage doLogin(String Email, String Password) throws IOException 
	{
		type("email_css", Email);
		click("submit_css");
		type("password_css", Password);
		click("submit2_css");
		
		
		/*driver.findElement(By.cssSelector("#login_id")).sendKeys(Email);
		driver.findElement(By.cssSelector(".btn.blue#nextbtn ")).click();
		//input#password
		driver.findElement(By.cssSelector("input#password")).sendKeys(Password);
		
		driver.findElement(By.cssSelector("form#login>button#nextbtn.btn.blue")).click();*/
		
		return new CRMhomePage();
	}
	
	

}
