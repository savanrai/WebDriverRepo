package com.facebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class FacebookLoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/savanrai/Documents/Jars/chromedriver");		
		driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");	
		driver.manage().window().fullscreen();
	}
	
	@AfterClass
	public void tearDown(){
		driver.close();
	}
	
	@Test
	public void loginTest(){
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("email");
		
		WebElement passwordField = driver.findElement(By.id("pass"));
		passwordField.sendKeys("password");
		
		WebElement clickLogin = driver.findElement(By.cssSelector("#loginbutton>input"));
		clickLogin.click();		
	}
	


}
