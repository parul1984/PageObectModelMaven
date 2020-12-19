package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Page;

public class HomePage extends Page {
	

	
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void goSignup()
	{
		System.out.println("YOOOOOOOOOOOOOOOOOO");
		
		//a.zh-signup
		driver.findElement(By.cssSelector("a.zh-signup")).click();
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		
	}

	public Login goToLogin() throws IOException 
	
	{ 
		System.out.println("YOOOOOOOOOOOOOOOOOO");
		Page.click("login_css");
	
		//driver.findElement(By.cssSelector("a.zgh-login")).click();
		return new Login();
	}
	
	public void gotoSuppot()
	{
		//a.zh-support
		
		driver.findElement(By.cssSelector("a.zh-support")).click();
	}
	
	public void gotozohoEDU()
	{
		
	}
	
	public void gotoLearnmore()
	{
		
	}
	
	public void ValidateFooterlink()
	{
		
		
	}
}
