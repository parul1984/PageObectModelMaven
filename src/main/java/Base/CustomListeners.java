package Base;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

import com.relevantcodes.extentreports.LogStatus;

import Utilities.MonitoringMail;
import Utilities.TestConfig;
import Utilities.TestUtils;

public class CustomListeners extends Page implements ITestListener, ISuiteListener {

	public CustomListeners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * Invoked each time before a test will be invoked. The <code>ITestResult</code>
	 * is only partially filled with the references to class, method, start millis
	 * and status.
	 *
	 * @param result the partially filled <code>ITestResult</code>
	 * 
	 * @see ITestResult#STARTED
	 */
	public void onTestStart(ITestResult result) {
		// not implemented
	}

	/**
	 * Invoked each time a test succeeds.
	 *
	 * @param result <code>ITestResult</code> containing information about the run
	 *               test
	 * @see ITestResult#SUCCESS
	 */
	public void onTestSuccess(ITestResult result) {
		// not implement
	/*	test.log(LogStatus.PASS, result.getName().toUpperCase() + "PASS");
		rep.endTest(test);
		rep.flush();*/
	}

	/**
	 * Invoked each time a test fails.
	 *
	 * @param result <code>ITestResult</code> containing information about the run
	 *               test
	 * @see ITestResult#FAILURE
	 */
	public void onTestFailure(ITestResult result) {
		/*try {
			Utilities.TestUtils.CaptureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, result.getName().toUpperCase() + "Failed" + result.getThrowable());

		test.log(LogStatus.FAIL, test.addScreenCapture(Utilities.TestUtils.screenshotName));
		rep.endTest(test);
		rep.flush();

		System.setProperty("org.uncommons.reportng.escape-output", "false");// for adding html in reportNG
		Reporter.log("Capturing ScreenShot");
		Reporter.log("<a target =\"_blank\" href=" + Utilities.TestUtils.screenshotName + ">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target =\"_blank\" href=" + Utilities.TestUtils.screenshotName + "><img src="
				+ Utilities.TestUtils.screenshotName + " height=200 widht=200></img></a>");
		// not implemented
*/	}

	/**
	 * Invoked each time a test is skipped.
	 *
	 * @param result <code>ITestResult</code> containing information about the run
	 *               test
	 * @see ITestResult#SKIP
	 */
	public void onTestSkipped(ITestResult result) {
		// not implemented
		/*
		 * test.log(LogStatus.SKIP,result.getName().toUpperCase() + "Skipped Test");
		 * rep.endTest(test); rep.flush();
		 */
		
		System.out.println("TestSkipped" +LogStatus.SKIP +result.getName().toUpperCase() + "Skipped Test");
	}

	/**
	 * Invoked each time a method fails but has been annotated with
	 * successPercentage and this failure still keeps it within the success
	 * percentage requested.
	 *
	 * @param result <code>ITestResult</code> containing information about the run
	 *               test
	 * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
	 */
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	/**
	 * Invoked each time a test fails due to a timeout.
	 *
	 * @param result <code>ITestResult</code> containing information about the run
	 *               test
	 */
	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	/**
	 * Invoked before running all the test methods belonging to the classes inside
	 * the &lt;test&gt; tag and calling all their Configuration methods.
	 */
	public void onStart(ITestContext context) {
		/*test = rep.startTest(context.getName().toUpperCase());
		 System.out.println(TestUtils.isTestRunnable(context.getName().toUpperCase(),
		 TestBase.excel));
		if (!TestUtils.isTestRunnable(context.getName().toUpperCase(), Page.excel)) {
			throw new SkipException("Skipping the test as the  Run Mode is N " + context.getName().toUpperCase());

		}
*/
		// not implemented
	}

	/**
	 * Invoked after all the test methods belonging to the classes inside the
	 * &lt;test&gt; tag have run and all their Configuration methods have been
	 * called.
	 */
	public void onFinish(ITestContext context) {
		// not implemented

	}

	public void onStart(ISuite suite) {
		// When <suite> tag starts
		System.out.println("onStart: before suite starts");
	}

	public void onFinish(ISuite suite) {
		/*// When <suite> tag completes
		MonitoringMail mail = new MonitoringMail();
		String messageBody;

		try {
			messageBody = "http://" + InetAddress.getLocalHost().getHostAddress() + ":8080/job/maven_dd/extentReport/";
			System.out.println(messageBody);

			try {

				messageBody = "Love you";
				mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody,
						TestConfig.attachmentPath, TestConfig.attachmentName);
			} catch (AddressException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (UnknownHostException e) {

			// TODO Auto-generated catch blockfhg
			e.printStackTrace();
		}*/
	}

}
