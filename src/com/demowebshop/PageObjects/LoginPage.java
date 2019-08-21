package com.demowebshop.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
		static String EmailfieldXpath = "email";
		static String PasswordfieldXpath = "passwd";
		static String LoginButtonXpath = "//*[@id='SubmitLogin']";		
		
		public static WebElement EmailFieldObject(WebDriver driver) {
			return driver.findElement(By.name(EmailfieldXpath));	
	    }	
		public static WebElement PassFieldObject(WebDriver driver) {
			return driver.findElement(By.name(PasswordfieldXpath));	
	    }
		public static WebElement LoginFieldObject(WebDriver driver) {
			return driver.findElement(By.xpath(LoginButtonXpath));	
	    }
}