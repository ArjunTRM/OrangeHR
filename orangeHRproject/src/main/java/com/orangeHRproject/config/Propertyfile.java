package com.orangeHRproject.config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import com.orangeHRproject.testScripts.Testscripts_assignLeave;
import com.orangeHRproject.testScripts.Testscripts_loginScreen;


public class Propertyfile {
	static String ProjectPath= System.getProperty("user.dir");
	static Properties prop =new Properties();
	static InputStream input;

	public static void getProperties(){
		try {
			input = new FileInputStream(ProjectPath+"/src/main/java/com/orangeHRproject/config/Keywords.properties");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//method for getting url from the properties file.
	public static void url_getProperties(){
		try {
			getProperties();
			prop.load(input);
			String url=prop.getProperty("url");
			Testscripts_loginScreen.url=url;
			System.out.println(Testscripts_loginScreen.url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void loginDetails_getProperties(){
		try {
			getProperties();
			prop.load(input);
			String username=prop.getProperty("username");
			String password=prop.getProperty("password");
			Testscripts_loginScreen.username=username;
			Testscripts_loginScreen.password=password;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void assisgnLeave_getProperties(){
		try {
			getProperties();
			prop.load(input);
			String Name=prop.getProperty("Name");
			String leaveType=prop.getProperty("leaveType");
			String fromDate=prop.getProperty("fromDate");
			String toDate=prop.getProperty("toDate");
			String Comment=prop.getProperty("Comment");
			Testscripts_assignLeave.Name=Name;
			Testscripts_assignLeave.leaveType=leaveType;
			Testscripts_assignLeave.fromDate=fromDate;
			Testscripts_assignLeave.toDate=toDate;
			Testscripts_assignLeave.Comment=Comment;		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
