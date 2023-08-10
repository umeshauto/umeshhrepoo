package com.CRM.Vtiger.genericUtility;

import java.awt.event.ItemListener;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplimentation implements ITestListener{

	ExtentReports reports;
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"test script execution started");
		test=reports.createTest(methodname); //for extent report
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"test script pass");
		test.log(Status.PASS,"test script pass"); //for extent report
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	  String methodname = result.getMethod().getMethodName();
	  System.out.println(methodname+"test script fail");
	  test.log(Status.FAIL,"test script fail");
	  
	  WebdriverUtility wu=new WebdriverUtility();
	  JavaUtility ju=new JavaUtility();
	  String Screenshotname = methodname+ju.systemDate();
	  try {
		  String path = wu.screenshot(BaseClass.sdriver, Screenshotname);
			test.addScreenCaptureFromPath(path); //convert absoulte to relative
	} catch (Throwable e) {
      e.printStackTrace();
	}
}

	  
	  
	

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname+"test script skipped");
		test.log(Status.SKIP, "test script skipped");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("suite level execution started");
		
		ExtentSparkReporter reporter=new ExtentSparkReporter("./ExtentReport/Reporter-"+new JavaUtility().systemDate()+"html");
		reporter.config().setDocumentTitle("Vtiger application report");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("Vtiger Execution report");
		
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("BaseURL", "http://localhost:8888");
		reports.setSystemInfo("Browser", "chrome");
		reports.setSystemInfo("reporter", "Siddu");
	}

	@Override
	public void onFinish(ITestContext context) {
	
		reports.flush();
		System.out.println("suit level execution completed");
	}

}
