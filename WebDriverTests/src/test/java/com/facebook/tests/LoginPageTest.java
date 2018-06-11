/**
 * 
 */
package com.facebook.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebook.pages.LoginPage;

/**
 * @author savanrai
 *
 */
public class LoginPageTest {
	
	
	@Test
	public void verifyValidLogin(){		
		
		System.setProperty("webdriver.chrome.driver", "/Users/savanrai/Documents/Jars/chromedriver");		
		WebDriver driver = new ChromeDriver();
		
		LoginPage login = new LoginPage(driver);
		driver.get(LoginPage.PAGE_URL);
		driver.manage().window().fullscreen();
		Assert.assertEquals(driver.getTitle(), LoginPage.PAGE_TITLE);
		login.typeEmail("savan@gmail.com");
	    login.typePassword("test");
	    login.clickLogin();	 
	    driver.quit();
		
	}
	


}
