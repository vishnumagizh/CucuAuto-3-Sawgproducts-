package com.helper;

import org.openqa.selenium.WebDriver;


import com.stepdefinition.pomclass;

public class Pageobjectmanager {
	public static WebDriver driver;
	private pomclass pom;
	
	public Pageobjectmanager(WebDriver driver2)
	{
		this.driver=driver2;
	}
	

	public pomclass getlp() {
		pom= new pomclass(driver);
		return pom;
		

	}
}
