package com.orangeHRproject.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.orangeHRproject.testbaseClass.Baseclass;

public class Pom_dashboard extends Baseclass{
	
	public static WebElement dashboard_assignleave(WebDriver driver){
		element=driver.findElement(By.xpath("//img[@src='/webres_5d6f937c9c7169.68307390/orangehrmLeavePlugin/images/ApplyLeave.png']"));
		return element;
	}
	public static WebElement dashboard_leaveList(WebDriver driver){
		element=driver.findElement(By.xpath("//img[@src='/webres_5d6f937c9c7169.68307390/orangehrmLeavePlugin/images/MyLeave.png']"));
		return element;
	}
	public static WebElement dashboard_timeSheets(WebDriver driver){
		element=driver.findElement(By.xpath("//img[@src='/webres_5d6f937c9c7169.68307390/orangehrmTimePlugin/images/MyTimesheet.png']"));
		return element;
	}
}
