package com.iNetBanking.PageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.iNetBanking.BaseTest.BaseClass;

public class NewCustomerReg_Page extends BaseClass {

	
	public NewCustomerReg_Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath ="//td[contains(text(),'Customer Name')]/following-sibling::td/child::input")
	WebElement customerName;
	
	
	@FindBy(xpath="//input[@name='rad1'][1]")
	WebElement maleRadioButton;
	
	@FindBy(xpath="//input[@name='rad1'][2]")
	WebElement femaleRadioButton;
	
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob;
	
	@FindBy(xpath="//textarea")
	WebElement address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement telephone;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//input[@type='reset']")
	WebElement reset;
	
	@FindBy(xpath="//p[text()='Add New Customer']")
	WebElement heading;
	
	public void rndString() {
		RandomStringUtils.randomAlphabetic(8);
	}
	
	
	
	
	
	
}
