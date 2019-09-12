package com.orangeHRproject.Utils;

import java.util.concurrent.TimeUnit;

import com.orangeHRproject.testbaseClass.Baseclass;

public class Utils_implicitlyWait extends Baseclass{
	public static void impWait3(){
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	public static void impWait5(){
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	public static void impWait8(){
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	}
}

