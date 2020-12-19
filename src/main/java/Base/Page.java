package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.TopMenue;
import Utilities.ExcelReader;
import Utilities.ExtentReportsManager;
import Utilities.TestUtils;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Page {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static TopMenue menue;
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis ;
	public static Logger log = Logger.getLogger(Page.class.getSimpleName());
	public static ExcelReader excel ; 
	
	public static JavascriptExecutor js;
	//public static WebDriverWait wait;
	public ExtentReports rep = ExtentReportsManager.getInstance();
	public static String browser;
	public  static ExtentTest test ;

	public Page() throws IOException {
		 PropertyConfigurator.configure(".\\src\\test\\Resources\\Properties\\log4j.properties");
		 
		 
	// Chrome Settings
		 
		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		options.addArguments("--disable-notifications");
		

		if (driver == null) {

			fis = new FileInputStream(".\\src\\test\\Resources\\Properties\\CONFIG.properties");
			
            config.load(fis);		
            log.info("File input-stream done for config properties");
		
		    fis = new FileInputStream(".\\src\\test\\Resources\\Properties\\OR.properties");
		 or.load(fis); 
			
		 if(System.getenv("browser")!= null && ! System.getenv("browser").isEmpty())
				
			{
				browser = System.getenv("browser");
			}
				
			else {
				browser = config.getProperty("browser");
			}
			
			config.setProperty("browser", browser);
			
			System.out.println(config.getProperty("browser"));
			
			if(config.getProperty("browser").equals("chrome"))
		 
			{
		 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			
			}
			
			
			else if (config.getProperty("browser").equals("firefox"))
			{
				
				WebDriverManager.firefoxdriver().setup();
				
				driver = new FirefoxDriver();
				 log.debug("FireFox Driver Setup Done");
			}
			 excel = new ExcelReader(".\\src\\test\\Resources\\excel\\TestData.xlsx");	
			driver.manage().window().maximize();
			driver.get(config.getProperty("testsiteurl"));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
			wait = new WebDriverWait(driver, 30);

			menue = new TopMenue(driver);
		}

	}
	public  void verifyEquals(String expected, String actual) throws IOException
	{
		
		try {
			
			Assert.assertEquals(actual, expected);
			
		}
		
		catch(Throwable t)
		{
			TestUtils.CaptureScreenshot();
			//Extent report 
			
			test.log(LogStatus.FAIL, "Verification Failed " + t.getMessage() );

			   test.log(LogStatus.FAIL, test.addScreenCapture(Utilities.TestUtils.screenshotName) );
			    rep.endTest(test);
			    rep.flush();
			   
			   // Report NG 
			   System.setProperty("org.uncommons.reportng.escape-output", "false");// for adding html in reportNG 
			   Reporter.log("<br>" + "Verification Failure" + t.getMessage() + "<br>" );
		       Reporter.log("<a target =\"_blank\" href="+Utilities.TestUtils.screenshotName+"><img src="+Utilities.TestUtils.screenshotName+" height=200 widht=200></img></a>");
		       Reporter.log("<br>");
		       Reporter.log("<br>");
		}
		
			
		
	}	
	
	
	
	
	public static  void  click(String locator)
	{
		driver.findElement(By.cssSelector(or.getProperty(locator))).click();
		//test.log(LogStatus.INFO, "Clicking on" + locator);
	}
	
	
	public static void type(String locator, String text)
	{
		driver.findElement(By.cssSelector(or.getProperty(locator))).sendKeys(text);
    //  test.log(LogStatus.INFO, "Typing in the locator" + locator);
	}
	
	
	public static void select (String locator, String Value)
	{
		WebElement dropdown = driver.findElement(By.cssSelector(or.getProperty(locator)));
		Select select = new Select(dropdown);
		select.selectByVisibleText(Value);
		System.out.println(Value);
	 // test.log(LogStatus.INFO, "Selecting in the locator" + locator);
	}
	
	
	////////////////////////////////////////////////////////////////////
    
    public boolean isElementPresent(By by)
    
    {
    	try
    	{
    		driver.findElement(by);
    		return true;
    	}
    	catch(NoSuchElementException e)
    	{
    		
    		return false ;
    	}
    	
    }
	
///////
    public static void quit() 
    
    {
       driver.quit();	
    	
    }
	

}
