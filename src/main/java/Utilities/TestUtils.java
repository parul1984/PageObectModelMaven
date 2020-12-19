package Utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import Base.Page;




public class TestUtils extends Page {

public TestUtils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


public static String screenshotPath;


public static String screenshotName;

public static void CaptureScreenshot () throws IOException
{
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Date date = new Date();
    screenshotName = date.toString().replace(":", "_").replace(" ","_") +".jpg";
	

	FileUtils.copyFile(srcFile, new File(".\\target\\surefire-reports\\html\\"+screenshotName));
	
	
	
}

@DataProvider (name = "dp")
public static Object[][] getData(Method m)

{       
	System.out.println("InsideData Provider");
	    String sheetName = m.getName();
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
	
		
		
		Object data[][] = new Object[rows-1][cols];
		
		
		for (int rowNum = 2 ; rowNum <= rows ; rowNum++)
		{
			for (int colNum = 0 ; colNum <= cols-1; colNum++)
			{
				
				data[rowNum-2][colNum]= excel.getCellData(sheetName, colNum, rowNum);
				
			}
			
			
		}
		
		return data;
}


public static boolean isTestRunnable(String testName , ExcelReader excel)
{
	// System.out.println(testName);
	
	 
	String sheetName = "testSuite";
	int rows = excel.getRowCount(sheetName);
	 boolean s = false ; 
// System.out.println(rows);
	
	for(int rNum=2; rNum<=rows; rNum++)
	{
       String testcase = excel.getCellData(sheetName,"TCID" , rNum);
  
	
	if (testcase.equalsIgnoreCase(testName))
	{
		 String run = excel.getCellData(sheetName,"RUN" , rNum);
		 System.out.println(testcase);
		 
		 
		 if(run.equalsIgnoreCase("N"))
		 s = false ; 
			 
		 else if (run.equalsIgnoreCase("Y"))
		 { 	 
	     s= true ;
	     break;   
		 }
		 	
	}
	

	
	}
	
	return s; 
	
	
	}

}

