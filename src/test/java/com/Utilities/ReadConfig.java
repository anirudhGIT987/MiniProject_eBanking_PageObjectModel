package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import jdk.internal.org.jline.utils.Log;

public class ReadConfig {

	
	Properties pro;
	public ReadConfig() {
		
		File src 	= new File("D:\\SaS@m\\Anirudh_Selenium\\iNetBanking_V1\\src\\main\\java\\com\\Config\\iBanking.properties");
		
		try {
			FileInputStream iBankingProperties = new FileInputStream(src);
			
			pro = new Properties();
			pro.load(iBankingProperties);
			
		}catch(Exception e) {
			Log.info("Exception is "+e.getMessage());
		}
	}
		public String getapplicationUrl() {
			
			String url =pro.getProperty("baseurl");
			return url;
		}
		public String getUsername() {
			String username=pro.getProperty("username");
		return username;}
		
		public String getpassword() {
			String password=pro.getProperty("password");
			return password;
		}
	public String getloginButton() {
		String loginButton=pro.getProperty("name_loginbutton");
		return loginButton;
	}
	public String getChromePath() {
		String chromePath=pro.getProperty("chromeDriverPath");
		return chromePath;
	}
	public String getEdgePath() {
		String edgePath=pro.getProperty("edgeDriverPath");
		return edgePath;
	}
}
