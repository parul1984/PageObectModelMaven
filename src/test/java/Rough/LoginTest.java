package Rough;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import Base.Page;
import Pages.HomePage;
import Pages.Login;
import Pages.SignUP;
import Pages.Accounts.CRMAccount;
import Pages.Accounts.CRMCreateAccount;
import io.github.bonigarcia.wdm.WebDriverManager;

/*public class LoginTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		HomePage home           = new HomePage();
		home.goToLogin().doLogin("Parul.h.mehta.a@gmail.com", "NS@1234567890").gotoAccount().gotoCreateAccount().addAccountInfo("Parul", "ASDF");
		
      
	}

}*/
