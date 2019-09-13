package com.orangeHRproject.testScripts;

import org.testng.annotations.Test;
import com.orangeHRproject.config.Propertyfile;
import com.orangeHRproject.pom.Pom_assignLeave;
import com.orangeHRproject.testbaseClass.Baseclass;

public class Testscripts_assignLeave extends Baseclass{
	@Test(priority =3)
	public static void Testscripts_employeeName(){
		Propertyfile.assisgnLeave_getProperties();
		Pom_assignLeave.assignleave_empName(driver).sendKeys(Name);
		Pom_assignLeave.assignleave_leaveType(driver).selectByValue(leaveType);
		Pom_assignLeave.assignleave_fromDate(driver).clear();
		Pom_assignLeave.assignleave_fromDate(driver).sendKeys(fromDate);
		Pom_assignLeave.assignleave_toDate(driver).clear();
		Pom_assignLeave.assignleave_toDate(driver).sendKeys(toDate);
		Pom_assignLeave.assignleave_Comment(driver).sendKeys(Comment);
		Pom_assignLeave.assignleave_assignBtn(driver).click();
		Pom_assignLeave.assignleave_assignPopup(driver).click();
	}
}