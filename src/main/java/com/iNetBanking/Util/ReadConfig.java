package com.iNetBanking.Util;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
	Properties prop;
	
	public ReadConfig() {
	 String propFilePath = "D:\\SaS@m\\Anirudh_Selenium\\iNetBanking_V1\\src\\main\\java\\com\\Config\\iBanking.properties"; 

	try {
	FileInputStream fis = new FileInputStream(propFilePath);
	prop = new Properties();
	prop.load(fis);
}	catch(Exception e ) {
System.out.println("Exception is: "+e.getMessage());
}
	
	}
	
	public String getApplicationUrl() {
	String	url=prop.getProperty("baseurl");
	return url;
	}
	
	public String getUsername() {
String username=prop.getProperty("username");
	return username;
	
	}
	
	public String getPassword() {
	String	password=prop.getProperty("password");
	return password;
	}
	
	public String getChromePath() {
		String chromePath = prop.getProperty("chromeDriverPath");
		return chromePath;
	}
	
	public String getEdgePath() {
		String edgePath = prop.getProperty("edgeDriverPath");
		return edgePath;
	}
	
	
	
	}