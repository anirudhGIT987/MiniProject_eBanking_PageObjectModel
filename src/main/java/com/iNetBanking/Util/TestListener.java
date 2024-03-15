package com.iNetBanking.Util;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.iNetBanking.BaseTest.BaseClass;

public class TestListener extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			captureScreen(driver,result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	
	
	
}
