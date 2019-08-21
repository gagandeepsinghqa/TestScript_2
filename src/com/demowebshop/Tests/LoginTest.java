package com.demowebshop.Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demowebshop.PageObjects.HomePage;
import com.demowebshop.PageObjects.LoginPage;
import com.demowebshop.Utilities.BaseTest;
import com.demowebshop.Utilities.ExcelReader;

public class LoginTest extends BaseTest{

	ExcelReader ER = new ExcelReader();
	
	@Test(dataProvider = "loginData")
	public void loginTestCase(String user, String Pass) {
		
    String a = HomePage.LoginLinkObject(driver).getText();
    System.out.println(a);
    LoginPage.EmailFieldObject(driver).sendKeys(user);
	LoginPage.PassFieldObject(driver).sendKeys(Pass);
	LoginPage.LoginFieldObject(driver).click();	
	}
	
	@DataProvider(name = "loginData")
	public Object[][] TestDataSupply() throws Exception {
		return ER.getExceData();
	
	}
}