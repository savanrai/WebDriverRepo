/**
 * 
 */
package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * @author savanrai
 *
 */
public class LoginPage {
	
	public static final String PAGE_TITLE = "Facebook – log in or sign up";
	public static final String PAGE_URL = "https://www.facebook.com/";
	
	By emailLocator = By.id("email");
	By passwordLocator = By.id("pass");
	By loginButton = By.cssSelector("#loginbutton>input");
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void typeEmail(String email){
		WebElement element = driver.findElement(emailLocator);
		element.sendKeys(email);
		Assert.assertEquals(element.getAttribute("value"), email);
	}
	
	public void typePassword(String password){
		WebElement element = driver.findElement(passwordLocator);
		element.sendKeys(password);
		Assert.assertEquals(element.getAttribute("value"), password);
	}
	
	public void clickLogin(){
		driver.findElement(loginButton).click();
	}

}
