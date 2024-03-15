package com.iNetBanking.PageObjects;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.iNetBanking.BaseTest.BaseClass;

public class LoginPage_iNetBanking extends BaseClass {

	SoftAssert soft = new SoftAssert();
	public String multiUserid;
	public String multiPassword;
	
	
	public LoginPage_iNetBanking() {
		PageFactory.initElements(driver, this);
	}
	
	
	//ObjectREpository
	//@FindBy(xpath ="//td[text()='UserID']/following-sibling::td/child::input[@name='uid']")
	@FindBy(name="uid")
	WebElement UserId;
	
//	@FindBy(xpath ="//td[text()='Password']/following-sibling::td/child::input")
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath ="//input[@name='btnLogin']")
	WebElement Login;
	
	
	
	//actions
	public void validatingTitle() {
		String expectedTitle="GTPL Bank Home Page";
		String actualTitle=driver.getTitle();
		
		//return driver.getTitle();
	
		soft.assertEquals(actualTitle, expectedTitle,"LoginPage Title is not Matched");
		
	}
	
	
	public void validatingLogin(String uname, String pwd) {
		driver.findElement(By.name("uid")).sendKeys(uname);	
		driver.findElement(By.xpath("//td[text()='Password']/following-sibling::td/child::input")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
log.info("Login is Clicked");		
		//String homePageTitle=driver.getTitle();
		//String expectedHomePageTitle ="Guru99 Bank Manager HomePage";
		//soft.assertEquals(homePageTitle, expectedHomePageTitle,"HomePage Title is not Matched");
		

if(isAlertPresent()==true) {
	driver.switchTo().alert().accept();
	driver.switchTo().defaultContent();
	System.out.println("Alert is clicked");
}
else {
	System.out.println("Alert is not present");
	driver.findElement(By.xpath("//a[text()='Log out']")).click();
	
}

	
	}
	
		
			
	
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}catch(Exception e) {
			return false;
		}
		
		
		
	}
	
	
}
