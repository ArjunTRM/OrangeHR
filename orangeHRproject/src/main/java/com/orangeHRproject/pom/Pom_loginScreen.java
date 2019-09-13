package com.orangeHRproject.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.orangeHRproject.testbaseClass.Baseclass;

public class Pom_loginScreen extends Baseclass{
	public static WebElement loginScreen_username(WebDriver driver){
		if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/auth/login"))
		{
			element=driver.findElement(By.id("txtUsername"));
		}
		else{
			System.out.println("Url for OrangeHR not launched");
		}
		return element;
	}
	public static WebElement loginScreen_password(WebDriver driver){
		element=driver.findElement(By.id("txtPassword"));
		return element;
	}
	public static WebElement loginScreen_loginButton(WebDriver driver){
		element=driver.findElement(By.id("btnLogin"));
		return element;
	}
}
