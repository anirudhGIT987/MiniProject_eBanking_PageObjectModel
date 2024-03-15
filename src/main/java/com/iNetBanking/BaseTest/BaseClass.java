package com.iNetBanking.BaseTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.iNetBanking.Util.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig rfg = new ReadConfig();
	
	public static WebDriver driver;
	public String applicationURL = rfg.getApplicationUrl();
	public String username =rfg.getUsername();
	public String password =rfg.getPassword();
	public static Logger log;
	

	@Parameters("browser")	
@BeforeClass
		public void setUp(String br) {
		
	if(br.equals("chrome")) {
		driver =WebDriverManager.chromedriver().create();
}
	if(br.equals("edge")) {
		driver =WebDriverManager.edgedriver().create();
}
	
	if(br.equals("firefox")) {
		WebDriverManager.firefoxdriver().create();
	}
	
		log = Logger.getLogger("e-banking");
		PropertyConfigurator.configure("Log4j.properties");
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//System.setProperty("webdriver.chrome.driver", rfg.getChromePath());
	//	driver = new ChromeDriver();
		
		driver.get(applicationURL);
		log.info("Url is opened");
		
	}
	
	
	
	public void tearDown() {
		driver.quit();
		log.info("driver is closed");
	}
	
	
	
	public void captureScreen(WebDriver driver, String snapName) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\SaS@m\\Anirudh_Selenium\\iNetBanking_V1\\ScreenShots"+snapName+".png"));
		
	}
	
	
	
}
