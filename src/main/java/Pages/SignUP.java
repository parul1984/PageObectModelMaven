package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Page;

public class SignUP  extends Page{
	

	
	public SignUP() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void doSignup(String Email, String Password)
	
	{
		
		//input.form-input.sgnemail
		
		driver.findElement(By.cssSelector("input.form-input.sgnemail")).sendKeys(Email);
		driver.findElement(By.cssSelector("input.form-input.sgnpaswrd")).sendKeys(Password);
		//input.form-input.sgnpaswrd
		//#signupbtn
	
		//#signup-termservice
		driver.findElement(By.cssSelector("#signup-termservice")).click();
		driver.findElement(By.cssSelector("#signupbtn")).click();
	}
	
	

}
