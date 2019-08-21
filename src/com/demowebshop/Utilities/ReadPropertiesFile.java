package com.demowebshop.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadPropertiesFile {

	
	String filepath = "C://Users//kodion Softwares//workspace//Infosys_2//src//com//demowebshop//propFiles//config.properties";
	
	Properties prop = new Properties();
	
	
	public String readPropFileByKey(String key) throws IOException {
		
		
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);		
		
		return prop.getProperty(key);
		
		
	}
	
}