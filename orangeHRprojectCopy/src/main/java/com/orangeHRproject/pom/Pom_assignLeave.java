package com.orangeHRproject.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.orangeHRproject.testbaseClass.Baseclass;

public class Pom_assignLeave extends Baseclass{
	public static WebElement assignleave_empName(WebDriver driver){
		element=driver.findElement(By.id("assignleave_txtEmployee_empName"));
		return element;
	}
	public static Select assignleave_leaveType(WebDriver driver){
		Select element= new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		return element;
	}
	public static WebElement assignleave_fromDate(WebDriver driver){
		element=driver.findElement(By.id("assignleave_txtFromDate"));
		return element;
	}
	public static WebElement assignleave_toDate(WebDriver driver){
		element=driver.findElement(By.id("assignleave_txtToDate"));
		return element;
	}
	public static WebElement assignleave_Comment(WebDriver driver){
		element=driver.findElement(By.id("assignleave_txtComment"));
		return element;
	}
	public static WebElement assignleave_assignBtn(WebDriver driver){
		element=driver.findElement(By.id("assignBtn"));
		return element;
	}
	public static WebElement assignleave_assignPopup(WebDriver driver){
		element=driver.findElement(By.id("confirmOkButton"));
		return element;
	}
}
