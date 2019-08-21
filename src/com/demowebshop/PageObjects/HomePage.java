package com.demowebshop.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

		// page objects from home page		
		static String LoginLink = "//*[@id='header']/div[2]/div/div/nav/span/strong";

		public static WebElement LoginLinkObject(WebDriver driver) {
			return driver.findElement(By.xpath(LoginLink));		
		}
	}