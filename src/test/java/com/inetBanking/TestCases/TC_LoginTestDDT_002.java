package com.inetBanking.TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.iNetBanking.BaseTest.BaseClass;
import com.iNetBanking.PageObjects.LoginPage_iNetBanking;

public class TC_LoginTestDDT_002 extends BaseClass{

	
	LoginPage_iNetBanking lp;
	
	public TC_LoginTestDDT_002() {
		lp = new LoginPage_iNetBanking();
	}
	
	
	@Test(priority =1)
	public void loginTestDataDriven() throws IOException {
		FileInputStream fis = new FileInputStream("D:\\SaS@m\\Anirudh_Selenium\\iNetBanking_V1\\src\\main\\java\\com\\iNetBanking\\TestDataFiles\\1LogInTest.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet tsheet = wb.getSheet("Sheet1");
		for(int ri = 1;ri<tsheet.getLastRowNum();ri++) {
			String	multiUserid=tsheet.getRow(ri).getCell(9).getStringCellValue();
			String	 multiPassword=tsheet.getRow(ri).getCell(10).getStringCellValue();
				
		lp.validatingLogin(multiUserid, multiPassword);
		
		
	}
	}
	
	
}
