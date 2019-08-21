package com.demowebshop.Utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	ReadPropertiesFile prop = new ReadPropertiesFile();
	SelectBrowser S = new SelectBrowser();
	protected WebDriver driver = null;
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		String url = prop.readPropFileByKey("URL");
			driver = S.getBrowser();
		    driver.navigate().to(url);
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void CloseDriver() {
		driver.close();
		driver.quit();
	}
}