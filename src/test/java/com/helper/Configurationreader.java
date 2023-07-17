package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurationreader {
	Properties prop;
	public Configurationreader() throws IOException {
	File file = new File("E:\\cucuproject\\src\\test\\java\\com\\helper\\login.property");
	FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
	prop.load(fis);
}
	
	public String browsername() {
	String property = prop.getProperty("browser");
	return property;
	}
	public String siteaddress() {
		String address = prop.getProperty("url");
		return address;
	}
}
