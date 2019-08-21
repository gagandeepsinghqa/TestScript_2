package com.demowebshop.Utilities;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectBrowser {
		
	Logger log = Logger.getLogger("SelectBrowser");
	
	ReadPropertiesFile prop = new ReadPropertiesFile();
	
	WebDriver driver = null;
	
	public WebDriver getBrowser() throws IOException {
		
		String browser = prop.readPropFileByKey("browser");
		while(browser == null) {
			log.info("browser not weorking..");		 
			System.exit(0);					
		}
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		return driver;
	}
}