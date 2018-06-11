package com.facebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Test {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/savanrai/Documents/Jars/chromedriver");		
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown(){
		driver.close();	
	}
	
	@Test
	public void loadPage(){
		driver.get("https://www.facebook.com");
	    Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
	} 
	
	@Test(dependsOnMethods="loadPage")
	public void filloutEmailField(){
	
		String email = "test@gmail.com";
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys(email);
		Assert.assertEquals(emailField.getAttribute("value"),email);
	}

}
