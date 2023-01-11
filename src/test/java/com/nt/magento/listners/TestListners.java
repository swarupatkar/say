package com.nt.magento.listners;


import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");

	
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");

		
	}

}
