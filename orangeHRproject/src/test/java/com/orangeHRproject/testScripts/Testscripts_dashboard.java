package com.orangeHRproject.testScripts;

import org.testng.annotations.Test;
import com.orangeHRproject.pom.Pom_dashboard;
import com.orangeHRproject.testbaseClass.Baseclass;

public class Testscripts_dashboard extends Baseclass{
	@Test(priority =2)
	public static void Testscripts_assignleave(){
		Pom_dashboard.dashboard_assignleave(driver).click();
	}
	
}
