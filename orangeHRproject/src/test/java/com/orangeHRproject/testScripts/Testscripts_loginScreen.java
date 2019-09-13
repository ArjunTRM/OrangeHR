package com.orangeHRproject.testScripts;

import org.testng.annotations.Test;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.orangeHRproject.config.Propertyfile;
import com.orangeHRproject.pom.Pom_loginScreen;
import com.orangeHRproject.testbaseClass.Baseclass;

public class Testscripts_loginScreen extends Baseclass {
	public static void Testscripts_scroll(){
		try {
			Robot R1;
			R1 = new Robot();
			R1.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			R1.keyRelease(KeyEvent.VK_DOWN);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@BeforeTest
	public static void Testscripts_launchUrl(){
		Propertyfile.url_getProperties();
		String driverPath=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",driverPath+"/Drivers/geckodriver/geckodriver");
		driver = new FirefoxDriver();
		driver.get(url);
	}
	@Test(priority =1)
	public static void Testscripts_loginDetails(){
		Propertyfile.loginDetails_getProperties();
		Pom_loginScreen.loginScreen_username(driver).sendKeys(username);
		Pom_loginScreen.loginScreen_password(driver).sendKeys(password);
		Pom_loginScreen.loginScreen_loginButton(driver).click();
		Testscripts_scroll();
	}
	@AfterTest
	public static void Testscripts_closeBrowser(){
		driver.close();
		System.out.println("Browser closed");
	}
}
