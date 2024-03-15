package com.inetBanking.TestCases;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.iNetBanking.BaseTest.BaseClass;
import com.iNetBanking.PageObjects.LoginPage_iNetBanking;

public class TC_LoginTest_001 extends BaseClass {

	LoginPage_iNetBanking lp ;
	
	
	public TC_LoginTest_001() {
		
	 lp = new LoginPage_iNetBanking();
	}
	
	
	
	@Test(priority =1)
	public void loginPageValidationTest() {
		lp.validatingTitle();
	}
	
	@Test(priority =2)
	public void userCredentialsLoginTest() {
		lp.validatingLogin(username, password);
		
		
		
	}
	
	
	
}
