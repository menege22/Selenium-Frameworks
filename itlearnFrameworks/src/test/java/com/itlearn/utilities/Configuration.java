package com.itlearn.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration {

	Properties pro;
	public Configuration()
	{
		File src= new File("./Configuration/Config.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
			pro =new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String getBrowser()
	{
		return pro.getProperty("browser");
	}
	
	public String getUrl()
	{
		return pro.getProperty("url");
	}
}
