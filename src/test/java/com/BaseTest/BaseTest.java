package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Utilities.ReadConfig;

public class BaseTest {
	
	ReadConfig rcfg = new ReadConfig();

	
	
	public static WebDriver driver;
	String applicationUrl = rcfg.getapplicationUrl();
	 public String userName = rcfg.getUsername();
	public String pwd = rcfg.getpassword();
	public static Logger log;
	
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String br) {
		
		if(br.equals("chrome")) {
			
		
		System.setProperty("webdriver.chrome.driver",rcfg.getChromePath());
		driver = new ChromeDriver();
		
		}
		if(br.equals("edge")) {
			System.setProperty("webdriver.edge.driver",rcfg.getEdgePath());
			driver = new EdgeDriver();
		}
		driver.get(applicationUrl);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		 log = Logger.getLogger("e-Banking");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	/*
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	*/
}
