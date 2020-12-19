package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Page;

public class TopMenue {
	public WebDriver driver ;
	
	public WebDriverWait wait;
	public TopMenue (WebDriver driver)

	{
		this.driver = driver ; 
		wait = new  WebDriverWait(this.driver,30);
	}


	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {
		
		Page.click("contacts_css");
	//	driver.findElement(By.cssSelector("div.lyteMenuItems > div:nth-child(3) > a")).click();
//		Alert alert = Page.wait.until(ExpectedConditions.alertIsPresent());
//		alert.accept();
//		//Assert.fail("Testing");

	}

	public void gotoAccounts() {
		//div.lyteMenuItems > div:nth-child(4) > a
		Page.click("Accounts_css");
		//driver.findElement(By.cssSelector("div.lyteMenuItems > div:nth-child(4) > a")).click();
/*  Alert alert = wait.until(ExpectedConditions.alertIsPresent());
   alert.accept();
   */
	}


	

	public void gotoActivities() {

	}

	public void gotoReports() {

	}

}
